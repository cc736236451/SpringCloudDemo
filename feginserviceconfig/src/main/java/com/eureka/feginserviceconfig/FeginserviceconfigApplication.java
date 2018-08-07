package com.eureka.feginserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginserviceconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginserviceconfigApplication.class, args);
	}
}
