package com.crossoverJie.order.feign.config;

import com.crossoverJie.order.feign.fallback.OrderServiceFallBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/9/3 21:55
 * @since JDK 1.8
 */
@Configuration
public class OrderConfig {
    @Bean
    public OrderServiceFallBack fb(){
        return new OrderServiceFallBack();
    }

}
