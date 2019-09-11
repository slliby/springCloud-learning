package com.wjp.learning.rabbitrece.bean;

import com.wjp.learning.rabbitsend.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-09 14:42
 */
@Component
public class HelloReceiver {

    @RabbitListener(queues = "queue")
    public void process(User user) {

        System.out.println("Receive " + user);
    }
}
