package com.crossoverJie.user.api;

import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.user.vo.req.UserReqVO;
import com.crossoverJie.user.vo.res.UserResVO;
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
@Api("用户服务API")
@RequestMapping(value = "/userService")
@Validated
public interface UserService {

    //测试
  
    @ApiOperation("获取用户")
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    BaseResponse<UserResVO> getOrderNo(@RequestBody UserReqVO userReqVO) ;

    @ApiOperation("通过Feign获取用户")
    @RequestMapping(value = "/getUserByFeign", method = RequestMethod.POST)
    BaseResponse<UserResVO> getUserByFeign(@RequestBody UserReqVO userReqVO) ;


    @ApiOperation("批量请求接口")
    @RequestMapping(value = "/getUserByFeignBatch", method = RequestMethod.POST)
    BaseResponse<UserResVO> getUserByFeignBatch(@RequestBody UserReqVO userReqVO) ;

    @ApiOperation("hystrix容错调用")
    @RequestMapping(value = "/getUserByHystrix", method = RequestMethod.POST)
    BaseResponse<OrderNoResVO> getUserByHystrix(@RequestBody UserReqVO userReqVO) ;
}
