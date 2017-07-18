package com.crossoverJie.user.vo.req;

import com.crossoverJie.sbcorder.common.req.BaseRequest;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/26 15:56
 * @since JDK 1.8
 */
public class UserReqVO extends BaseRequest{

    @NotNull(message = "用户ID不能为空")
    @ApiModelProperty(required = true, value = "用户ID", example = "123")
    private long userId ;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
