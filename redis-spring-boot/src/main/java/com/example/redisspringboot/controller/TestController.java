package com.example.redisspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class TestController {
    @Value("${test}")
    private String test;
    @GetMapping
    public String test() {
        log.info(test);
        return "success";
    }
}
