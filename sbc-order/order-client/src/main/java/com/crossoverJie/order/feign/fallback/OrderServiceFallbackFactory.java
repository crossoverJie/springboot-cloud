package com.crossoverJie.order.feign.fallback;

import com.crossoverJie.order.feign.api.OrderServiceClient;
import com.crossoverJie.order.vo.req.OrderNoReqVO;
import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.enums.StatusEnum;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Function:查看fallback原因
 *
 * @author crossoverJie
 *         Date: 2017/9/4 00:45
 * @since JDK 1.8
 */
public class OrderServiceFallbackFactory implements FallbackFactory<OrderServiceClient>{

    private final static Logger LOGGER = LoggerFactory.getLogger(OrderServiceFallbackFactory.class);


    @Override
    public OrderServiceClient create(Throwable throwable) {

        return new OrderServiceClient() {
            @Override
            public BaseResponse<OrderNoResVO> getOrderNo(@RequestBody OrderNoReqVO orderNoReq) {
                LOGGER.error("fallback:" + throwable);

                BaseResponse<OrderNoResVO> baseResponse = new BaseResponse<>() ;
                OrderNoResVO vo = new OrderNoResVO() ;
                vo.setOrderId(123456L);
                baseResponse.setDataBody(vo);
                baseResponse.setMessage(StatusEnum.FALLBACK.getMessage());
                baseResponse.setCode(StatusEnum.FALLBACK.getCode());
                return baseResponse;
            }
        };
    }
}
