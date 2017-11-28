package com.crossoverjie.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关应用
 * @author crossoverJie
 * @date 2017/11/14
 */
@SpringBootApplication

//开启zuul代理
@EnableZuulProxy
public class SbcGateWayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcGateWayZuulApplication.class, args);
	}
}
