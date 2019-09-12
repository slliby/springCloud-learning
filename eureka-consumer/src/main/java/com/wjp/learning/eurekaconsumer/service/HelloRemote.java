package com.wjp.learning.eurekaconsumer.service;

import com.wjp.learning.eurekaconsumer.bean.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * name表示服务提供者，fallback表示降级策略
 * @Author: wangjiaping
 * @Date: 2019-09-11 14:35
 */
@FeignClient(name = "eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    /**
     * 远程调用提供服务的对应接口
     * @param name，参数
     * @return 调用结果
     */
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
