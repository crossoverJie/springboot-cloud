package com.crossoverJie.sbcorder.req;

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
public class OrderNoReq extends BaseRequest{

    @NotNull(message = "应用ID不能为空")
    @ApiModelProperty(required = true, value = "应用ID", example = "00100")
    private Long appId ;//应用ID

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
