package com.cont.disater.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "base-web") /*内网基础服务访问*/
public interface BaseService {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    String get(@RequestParam(value = "key", required = true) String key);

    @RequestMapping(value = "/put", method = RequestMethod.POST)
    @ResponseBody
    String put(@RequestParam(value = "key", required = true) String key,
               @RequestParam(value = "value", required = true) String value);

}
