package com.eureka.eurekafeign.api;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UseApiFactory implements FallbackFactory<UseApi> {

    @Override
    public UseApi create(Throwable throwable) {
        return new UseApi() {
            @Override
            public String hello(String item) {
                return "接口调整失败";
            }

            @Override
            public MyEntity entiry(MyEntity entity) {
                MyEntity myEntity = new MyEntity();
                myEntity.setHello("接口调整失败");
                return myEntity;
            }
        };
    }
}
