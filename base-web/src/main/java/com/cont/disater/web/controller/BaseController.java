package com.cont.disater.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BaseController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("get")
    public String get(String key) {
        log.info("base-web key");
        String value = key == null ? null : redisTemplate.opsForValue().get(key);
        return "<h1>get k8s</h1>" + value;
    }

    @PostMapping("put")
    public String put(String key, String value) {
        log.info("base-web put");
        redisTemplate.opsForValue().set(key, value);
        return "<h1>put k8s</h1>" + value;
    }
}
