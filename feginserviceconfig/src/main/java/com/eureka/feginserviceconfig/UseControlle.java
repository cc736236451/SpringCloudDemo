package com.eureka.feginserviceconfig;

import api.UseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/use")
public class UseControlle {

    @Autowired
    private UseApi useApi;

    @GetMapping("/hello")
    public String hello()
    {
        String hello = useApi.hello("aaaaaa");
        return hello;
    }
}
