package com.crossoverJie.user.feign.api;

import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.user.api.UserService;
import com.crossoverJie.user.vo.req.UserReqVO;
import com.crossoverJie.user.vo.res.UserResVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
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
@RequestMapping(value="/userService")
@FeignClient(name="sbc-user")
//@RibbonClient
public interface UserServiceClient extends UserService{


    @ApiOperation("获取用户")
    @RequestMapping(value = "/getOrderNo", method = RequestMethod.POST)
    BaseResponse<UserResVO> getOrderNo(@RequestBody UserReqVO orderNoReq) ;


    @ApiOperation("通过Feign获取用户")
    @RequestMapping(value = "/getUserByFeign", method = RequestMethod.POST)
    BaseResponse<UserResVO> getUserByFeign(@RequestBody UserReqVO userReqVO) ;
}
