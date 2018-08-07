package com.eruka.feginclientconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${demo}")
    private String name;

    @GetMapping("/demo")
    public String demo()
    {
        return "demo:"+name;
    }
}
