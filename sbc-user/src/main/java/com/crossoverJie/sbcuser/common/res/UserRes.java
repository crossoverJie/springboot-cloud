package com.crossoverJie.sbcuser.common.res;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/8 上午12:01
 * @since JDK 1.8
 */
public class UserRes extends BaseResponse{
    private long userId ;
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

    @Override
    public String toString() {
        return "UserRes{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
