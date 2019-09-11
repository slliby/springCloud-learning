package com.wjp.learning.rabbitrece.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: wangjiaping
 * @Date: 2019-09-09 14:34
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
