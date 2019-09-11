package com.wjp.learning.rabbitsend.bean;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-09 14:36
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate template;

    public void send(User user) {
        template.convertAndSend("queue", user);
    }

    public void sendByDirect(User user) {
        template.convertAndSend("testDirectExchange", "testKey", user);
    }
}
