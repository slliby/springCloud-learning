package com.wjp.learning.eurekaconsumer.bean;

import com.wjp.learning.eurekaconsumer.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-11 15:43
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello " + name + ", sorry, service is error";
    }
}
