package com.crossoverJie.sbcuser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.crossoverJie.order.feign.api"})
public class SbcUserApplication {
	private static final Logger logger = LoggerFactory.getLogger(SbcUserApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SbcUserApplication.class);
		app.run(args);
		logger.info("SpringBoot Start Success");
	}
}
