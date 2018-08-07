package com.eureka.feignserviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableConfigServer
public class FeignserviceconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignserviceconfigApplication.class, args);
	}
}
