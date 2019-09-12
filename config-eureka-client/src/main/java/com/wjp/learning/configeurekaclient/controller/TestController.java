package com.wjp.learning.configeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-12 09:38
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${test.msg}")
    private String msg;

    @GetMapping("/getMsg")
    public String getMsg() {
        return msg;
    }
}
