package com.crossoverJie.sbcuser.controller;

import com.alibaba.fastjson.JSON;
import com.crossoverJie.order.feign.api.OrderServiceClient;
import com.crossoverJie.order.vo.req.OrderNoReqVO;
import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.sbcuser.req.OrderNoReq;
import com.crossoverJie.sbcuser.res.UserRes;
import com.crossoverJie.user.api.UserService;
import com.crossoverJie.user.vo.req.UserReqVO;
import com.crossoverJie.user.vo.res.UserResVO;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Function:user控制器
 * @author crossoverJie
 * Date: 2017/6/7 下午11:55
 * @since JDK 1.8
 */
@RestController
@Api(value = "userApi", description = "用户API", tags = {"用户服务"})
public class UserController implements UserService{
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    //@Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderServiceClient orderServiceClient ;


    @Override
    public BaseResponse<UserResVO> getOrderNo(@RequestBody UserReqVO userReq) {
        OrderNoReq req = new OrderNoReq() ;
        req.setReqNo("1213");
        //调用远程服务
        ResponseEntity<Object> res = restTemplate.postForEntity("http://sbc-order/order/getOrderNo", req, Object.class);
        logger.info("res="+JSON.toJSONString(res));

        logger.debug("入参="+ JSON.toJSONString(userReq));
        UserRes userRes = new UserRes() ;
        userRes.setUserId(123);
        userRes.setUserName("张三");

        userRes.setReqNo(userReq.getReqNo());
        userRes.setCode(StatusEnum.SUCCESS.getCode());
        userRes.setMessage("成功");

        return userRes ;
    }

    @Override
    public BaseResponse<UserResVO> getUserByFeign(@RequestBody UserReqVO userReq) {
        //调用远程服务
        OrderNoReqVO vo = new OrderNoReqVO() ;
        vo.setReqNo(userReq.getReqNo());
        BaseResponse<OrderNoResVO> orderNo = orderServiceClient.getOrderNo(vo);

        logger.info("远程返回:"+JSON.toJSONString(orderNo));

        UserRes userRes = new UserRes() ;
        userRes.setUserId(123);
        userRes.setUserName("张三");

        userRes.setReqNo(userReq.getReqNo());
        userRes.setCode(StatusEnum.SUCCESS.getCode());
        userRes.setMessage("成功");

        return userRes ;
    }
}
