package com.crossoverJie.sbcuser;

import com.alibaba.fastjson.JSON;
import com.crossoverJie.order.feign.api.OrderServiceClient;
import com.crossoverJie.order.vo.req.OrderNoReqVO;
import com.crossoverJie.order.vo.res.OrderNoResVO;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbcUserApplicationTests {

	@Autowired
	private OrderServiceClient orderServiceClient ;

	@Test
	public void contextLoads() {
		OrderNoReqVO vo = new OrderNoReqVO() ;
		vo.setReqNo("qwqe");
		BaseResponse<OrderNoResVO> orderNo = orderServiceClient.getOrderNo(vo);
		System.out.println(JSON.toJSON(orderNo));
	}

}
