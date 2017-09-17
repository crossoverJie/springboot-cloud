package com.crossoverJie.hystrix.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//开启EnableTurbine


@EnableTurbine
@SpringBootApplication
@EnableHystrixDashboard
public class SbcHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcHystrixTurbineApplication.class, args);
	}
}
