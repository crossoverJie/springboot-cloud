package com.crossoverJie.order.api;

import com.crossoverJie.order.vo.req.OrderNoReqVO;
import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/7/16 19:48
 * @since JDK 1.8
 */
@RestController
@Api("订单服务API")
@RequestMapping(value = "/orderService")
@Validated
public interface OrderService {

    /**
     * 活动订单号
     * @param orderNoReq
     * @return
     */
    @ApiOperation("获取订单号")
    @RequestMapping(value = "/getOrderNo", method = RequestMethod.POST)
    BaseResponse<OrderNoResVO> getOrderNo(@RequestBody OrderNoReqVO orderNoReq) ;

    /**
     * 限流获取订单号
     * @param orderNoReq
     * @return
     */
    @ApiOperation("限流获取订单号")
    @RequestMapping(value = "/getOrderNoLimit", method = RequestMethod.POST)
    BaseResponse<OrderNoResVO> getOrderNoLimit(@RequestBody OrderNoReqVO orderNoReq) ;

    /**
     * 通用限流获取订单号
     * @param orderNoReq
     * @return
     */
    @ApiOperation("通用限流获取订单号")
    @RequestMapping(value = "/getOrderNoCommonLimit", method = RequestMethod.POST)
    BaseResponse<OrderNoResVO> getOrderNoCommonLimit(@RequestBody OrderNoReqVO orderNoReq) ;
}
