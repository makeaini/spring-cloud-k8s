package com.cont.disater.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 主程序
 *
 * @author: chenlong
 * @date:2020-06-01
 * @version:v1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DisasterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisasterWebApplication.class, args);
    }
}
