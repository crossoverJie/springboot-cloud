package com.crossoverJie.sbcorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

@EnableCircuitBreaker
//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.crossoverJie.sbcorder,com.crossoverjie.distributed.intercept")
public class SbcOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcOrderApplication.class, args);
	}
}
