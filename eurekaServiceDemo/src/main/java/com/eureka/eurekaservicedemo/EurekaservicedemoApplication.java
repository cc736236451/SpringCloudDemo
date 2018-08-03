package com.eureka.eurekaservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaservicedemoApplication.class, args);
	}
}
