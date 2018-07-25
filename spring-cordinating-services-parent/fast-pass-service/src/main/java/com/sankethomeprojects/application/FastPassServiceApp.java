package com.sankethomeprojects.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FastPassServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(FastPassServiceApp.class, args);
	}

}
