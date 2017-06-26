package com.crossoverJie.sbcorder.req;

import com.crossoverJie.sbcorder.common.req.BaseRequest;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/26 15:56
 * @since JDK 1.8
 */
public class OrderNoReq extends BaseRequest{
    private String appId ;//应用ID

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
