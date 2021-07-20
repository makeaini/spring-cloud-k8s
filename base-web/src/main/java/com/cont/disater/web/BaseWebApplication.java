package com.cont.disater.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 主程序
 *
 * @author: chenlong
 * @date:2020-06-01
 * @version:v1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BaseWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseWebApplication.class, args);
    }
}
