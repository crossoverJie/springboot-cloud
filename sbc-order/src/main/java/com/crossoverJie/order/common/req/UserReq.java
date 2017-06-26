package com.crossoverJie.sbcuser.common.req;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/8 上午12:10
 * @since JDK 1.8
 */
public class UserReq extends BaseRequest {
    private long userId ;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
