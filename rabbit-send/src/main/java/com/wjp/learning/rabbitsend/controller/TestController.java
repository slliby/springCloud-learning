package com.wjp.learning.rabbitsend.controller;

import com.wjp.learning.rabbitsend.bean.HelloSender;
import com.wjp.learning.rabbitsend.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-09 14:38
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/hello")
    public String testRabbitSend(String name, int age) {
        User user = new User();
        user.setId(new Random().nextInt(100));
        user.setName(name);
        user.setAge(age);
        helloSender.send(user);
        return "success";
    }

    @GetMapping("/direct")
    public String testRabbitByDirect(String name, int age) {
        User user = new User();
        user.setId(new Random().nextInt(100));
        user.setName(name);
        user.setAge(age);
        helloSender.sendByDirect(user);
        return "success";
    }
}
