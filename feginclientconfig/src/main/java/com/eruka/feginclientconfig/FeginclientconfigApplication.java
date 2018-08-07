package com.eruka.feginclientconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginclientconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginclientconfigApplication.class, args);
	}
}
