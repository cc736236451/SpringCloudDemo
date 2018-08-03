package com.eureka.eurekafeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallbackFactory = UseApiFactory.class)
@Component
public interface UseApi {

    @RequestMapping(value = "/api/hello/{param}",method = RequestMethod.GET)
    public String hello(@PathVariable("param") String item);

    @RequestMapping(value = "/api/json",method = RequestMethod.POST)
    public MyEntity entiry(MyEntity entity);
}
