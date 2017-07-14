package com.crossoverJie.sbcorder.controller;

import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcorder.common.exception.SBCException;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.sbcorder.common.util.DateUtil;
import com.crossoverJie.sbcorder.req.OrderNoReq;
import com.crossoverJie.sbcorder.res.OrderNoRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:order控制器
 * @author crossoverJie
 * Date: 2017/6/7 下午11:55
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final static Logger logger = LoggerFactory.getLogger(OrderController.class);


    @RequestMapping(value = "getOrderNo" ,method = RequestMethod.POST)
    public BaseResponse<OrderNoRes> getOrderNo(@RequestBody OrderNoReq orderNoReq){
        BaseResponse<OrderNoRes> res = new BaseResponse();
        res.setReqNo(orderNoReq.getReqNo());
        if (null == orderNoReq.getAppId()){
           throw new SBCException(StatusEnum.FAIL);
        }
        OrderNoRes orderNoRes = new OrderNoRes() ;
        orderNoRes.setOrderId(DateUtil.getLongTime());
        res.setCode(StatusEnum.SUCCESS.getCode());
        res.setMessage(StatusEnum.SUCCESS.getMessage());
        res.setDataBody(orderNoRes);
        return res ;
    }
}
