package com.eureka.eurekapeer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekapeerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekapeerApplication.class, args);
	}
}
