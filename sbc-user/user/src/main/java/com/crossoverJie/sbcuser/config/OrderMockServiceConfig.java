package com.crossoverJie.sbcuser.config;

import com.crossoverJie.order.feign.api.OrderServiceClient;
import com.crossoverJie.sbcorder.common.res.BaseResponse;
import com.crossoverJie.sbcorder.common.util.DateUtil;
import org.powermock.api.mockito.PowerMockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/10/14 20:51
 * @since JDK 1.8
 */
@Component
public class OrderMockServiceConfig implements CommandLineRunner {

    private final static Logger logger = LoggerFactory.getLogger(OrderMockServiceConfig.class);

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${excute.env}")
    private String env;

    @Override
    public void run(String... strings) throws Exception {

        // 非本地环境不做处理
        if ("dev".equals(env) || "test".equals(env) || "pro".equals(env)) {
            return;
        }

        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();

        OrderServiceClient orderServiceClient = defaultListableBeanFactory.getBean(OrderServiceClient.class);
        logger.info("======orderServiceClient {}=====", orderServiceClient.getClass());

        defaultListableBeanFactory.removeBeanDefinition(OrderServiceClient.class.getCanonicalName());

        OrderServiceClient mockOrderApi = PowerMockito.mock(OrderServiceClient.class,
                invocationOnMock -> BaseResponse.createSuccess(DateUtil.getLongTime() + "", "mock orderNo success"));

        defaultListableBeanFactory.registerSingleton(OrderServiceClient.class.getCanonicalName(), mockOrderApi);

        logger.info("======mockOrderApi {}=====", mockOrderApi.getClass());
    }
}
