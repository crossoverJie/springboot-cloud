package com.crossoverjie.gateway.zuul.filter;

import com.crossoverJie.sbcorder.common.util.StringUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Function: 请求拦截
 *
 * @author crossoverJie
 *         Date: 2017/11/20 00:33
 * @since JDK 1.8
 */
public class RequestFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(RequestFilter.class) ;
    /**
     * 请求路由之前被拦截 实现 pre 拦截器
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtil.isEmpty(token)){
            logger.warn("need token");
            //过滤请求
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            return null ;
        }
        logger.info("token ={}",token) ;

        return null;
    }
}
