package com.wjp.learning.configtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigTestApplication.class, args);
    }

}
