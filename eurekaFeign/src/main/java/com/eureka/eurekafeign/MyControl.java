package com.eureka.eurekafeign;

import com.eureka.eurekafeign.api.MyEntity;
import com.eureka.eurekafeign.api.UseApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/useapi")
public class MyControl {

    @Autowired
    private UseApi useApi;

    @GetMapping("/hello")
    public String hello()
    {
        String re = useApi.hello("你好");
        return re;
    }

    @PostMapping("/entity")
    public MyEntity entity()
    {
        MyEntity myEntity = new MyEntity();
        myEntity.setHello("你好啊");
        MyEntity entiry = useApi.entiry(myEntity);
        return entiry;
    }

}
