package com.crossoverjie.gateway.zuul.conf;

import com.crossoverjie.gateway.zuul.filter.RequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2017/11/20 00:43
 * @since JDK 1.8
 */
@Configuration
@Component
public class FilterConf {

    @Bean
    public RequestFilter filter(){
        return  new RequestFilter() ;
    }
}
