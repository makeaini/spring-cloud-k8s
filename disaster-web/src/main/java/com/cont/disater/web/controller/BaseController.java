package com.cont.disater.web.controller;

import com.cont.disater.web.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BaseController {
    @Autowired
    private BaseService baseService;

    @GetMapping
    public String get(String key) {
        log.info("进入服务器get");
        String test = baseService.get(key);
        return test;
    }
    @PostMapping
    public String put(String key,String value) {
        log.info("进入服务器put");
        String test = baseService.put(key,value);
        return test;
    }
}
