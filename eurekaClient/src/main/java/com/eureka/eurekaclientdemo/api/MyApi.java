package com.eureka.eurekaclientdemo.api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyApi {

    @ApiOperation(value="测试接口hello", notes="测试接口hello详情")
    @GetMapping("/hello/{param}")
    public String hello(@PathVariable("param") String item)
    {
        String re = "hello "+item;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~`useapi");
        return re;
    }

    @ApiOperation(value="测试接口json", notes="测试接口json详情")
    @PostMapping("/json")
    public MyEntity json(@RequestBody(required = false) MyEntity entity)
    {
       return entity;
    }
}
