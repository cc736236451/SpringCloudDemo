package com.eureka.ribbondemo.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/useapi")
public class UseApi {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello/{param}")
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(@PathVariable("param") String item)
    {
        String path = "http://eureka-client/api/hello/"+item;
        String forObject = restTemplate.getForObject(path, String.class);
        return forObject;
    }

    public String helloError(String item)
    {
        return "接口调用失败!";
    }

    @PostMapping("/json")
    public String json(String json)
    {
        String path = "http://eureka-client/api/json";

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);

        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("entity", json);

        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);

        ResponseEntity<String> response2 = restTemplate.postForEntity(path, httpEntity, String.class);
        return  response2.getBody();
    }
}
