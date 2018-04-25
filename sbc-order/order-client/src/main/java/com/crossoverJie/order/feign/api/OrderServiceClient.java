package com.crossoverJie.order.feign.api;

import com.crossoverJie.order.api.OrderService;
import com.crossoverJie.order.feign.config.OrderConfig;
import com.crossoverJie.order.feign.fallback.OrderServiceFallbackFactory;
import com.crossoverJie.order.vo.req.OrderNoReqVO;
import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/7/16 19:00
 * @since JDK 1.8
 */
@RequestMapping(value="/orderService")
@FeignClient(name="sbc-order",
        fallbackFactory = OrderServiceFallbackFactory.class,
        // FIXME: 2017/9/4 如果配置了 fallback 那么 fallbackFactory 将会无效
        //fallback = OrderServiceFallBack.class,
        configuration = OrderConfig.class)
@RibbonClient
public interface OrderServiceClient extends OrderService{


    /**
     * 获取订单号
     * @param orderNoReq
     * @return
     */
    @Override
    @ApiOperation("获取订单号")
    @RequestMapping(value = "/getOrderNo", method = RequestMethod.POST)
    BaseResponse<OrderNoResVO> getOrderNo(@RequestBody OrderNoReqVO orderNoReq) ;
}
