package com.sankethomeprojects.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaTollRateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTollRateServiceApplication.class, args);
	}
}
