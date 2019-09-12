package com.wjp.learning.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-11 14:28
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world! welcome " + name;
    }
}
