package com.crossoverJie.sbcorder.res;

import com.crossoverJie.sbcorder.common.res.BaseResponse;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/6/26 15:43
 * @since JDK 1.8
 */
public class OrderNoRes extends BaseResponse {
    private Long orderId ;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
