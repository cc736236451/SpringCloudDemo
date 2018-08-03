package com.eureka.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class EurekazuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekazuulApplication.class, args);
	}

	@Bean
	public MyFilter getMyFilter()
	{
		return new MyFilter();
	}
}
