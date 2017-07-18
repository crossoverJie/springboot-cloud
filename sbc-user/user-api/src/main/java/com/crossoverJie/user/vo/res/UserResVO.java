package com.crossoverJie.user.vo.res;

import io.swagger.annotations.ApiModelProperty;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/26 15:43
 * @since JDK 1.8
 */
public class UserResVO {
    /**
     * userID
     */
    @ApiModelProperty(required = false, value = "用户ID", example = "123")
    private long userId ;
    /**
     * 用户名
     */
    @ApiModelProperty(required = false, value = "用户名称", example = "张三")
    private String userName ;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
