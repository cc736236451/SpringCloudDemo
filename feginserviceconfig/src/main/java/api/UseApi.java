package api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
@Component
public interface UseApi {

    @RequestMapping(value = "/api/hello/{param}",method = RequestMethod.GET)
    public String hello(@PathVariable("param") String item);

}
