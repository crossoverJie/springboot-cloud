package com.crossoverJie.sbcuser.controller;

import com.alibaba.fastjson.JSON;
import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcuser.req.OrderNoReq;
import com.crossoverJie.sbcuser.req.UserReq;
import com.crossoverJie.sbcuser.res.UserRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Function:user控制器
 * @author crossoverJie
 * Date: 2017/6/7 下午11:55
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public UserRes getUser(@RequestBody UserReq userReq){
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
}
