package com.crossoverJie.request.check.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.crossoverJie.request.check.interceptor,com.crossoverJie.request.check.properties")

//是否有redis配置的校验，如果没有配置则不会加载改配置，也就是当前插件并不会生效
@Conditional(CheckReqCondition.class)
public class CheckReqConf {
}
