package com.eureka.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReadConfigController {

    @Value("${demo}")
    private String demo;

    @GetMapping("/read")
    public String read()
    {
        return "demo:"+demo;
    }
}
