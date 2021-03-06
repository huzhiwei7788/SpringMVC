package com.feign_sonsumer.feign_sonsumer.FeignFallback;

import com.harvey.helloserviceapi.model.User;
import com.harvey.helloserviceapi.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


//@Component
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("unknown", 0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "error ";
    }
}
