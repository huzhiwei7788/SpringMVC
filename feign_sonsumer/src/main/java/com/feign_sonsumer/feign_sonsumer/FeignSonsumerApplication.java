package com.feign_sonsumer.feign_sonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignSonsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignSonsumerApplication.class, args);
    }

}
