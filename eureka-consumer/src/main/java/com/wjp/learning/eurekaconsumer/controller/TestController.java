package com.wjp.learning.eurekaconsumer.controller;

import com.wjp.learning.eurekaconsumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-11 14:40
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloRemote.hello(name);
    }
}
