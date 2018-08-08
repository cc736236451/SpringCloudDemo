package com.eureka.feignclientconfigbus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${demo}")
    private String demo;

    @GetMapping("/demo")
    public String demo()
    {
        return "demo:"+demo;
    }
}
