package com.crossoverJie.request.check.interceptor;

import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcorder.common.exception.SBCException;
import com.crossoverJie.sbcorder.common.req.BaseRequest;
import com.crossoverJie.sbcorder.common.util.StringUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * Function:切面
 *
 * @author crossoverJie
 *         Date: 2017/7/31 20:07
 * @since JDK 1.8
 */
//切面注解
@Aspect
//扫描
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ReqNoDrcAspect {
    private static Logger logger = LoggerFactory.getLogger(ReqNoDrcAspect.class);


    @Value("${redis.prefixReq:reqNo}")
    private String prefixReq ;

    @Value("${redis.day:1}")
    private long day ;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @PostConstruct
    public void init() throws Exception {
        logger.info("sbc-request-check init......");
    }

    /**
     * 切面该注解
     */
    @Pointcut("@annotation(com.crossoverJie.request.check.anotation.CheckReqNo)")
    public void checkRepeat(){
    }

    @Before("checkRepeat()")
    public void before(JoinPoint joinPoint) throws Exception {
        BaseRequest request = getBaseRequest(joinPoint);
        if(request != null){
            final String reqNo = request.getReqNo();
            if(StringUtil.isEmpty(reqNo)){
                throw new SBCException(StatusEnum.REPEAT_REQUEST);
            }else{
                try {
                    String tempReqNo = redisTemplate.opsForValue().get(prefixReq +reqNo);
                    logger.debug("tempReqNo=" + tempReqNo);

                    if((StringUtil.isEmpty(tempReqNo))){
                        redisTemplate.opsForValue().set(prefixReq + reqNo, reqNo, day, TimeUnit.DAYS);
                    }else{
                        throw new SBCException("请求号重复,reqNo=" + reqNo);
                    }

                } catch (RedisConnectionFailureException e){
                    logger.error("redis操作异常",e);
                    throw new SBCException("need redisService") ;
                }
            }
        }

    }



    public static BaseRequest getBaseRequest(JoinPoint joinPoint) throws Exception {
        BaseRequest returnRequest = null;
        Object[] arguments = joinPoint.getArgs();
        if(arguments != null && arguments.length > 0){
            returnRequest = (BaseRequest) arguments[0];
        }
        return returnRequest;
    }
}
