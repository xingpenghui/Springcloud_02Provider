package com.feri.springcloud_02provider.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2018/9/28 10:22
 */
@RestController
public class HelloApp {

    @GetMapping("/hello.do")
    public String hello(){
        System.out.println("服务提供者：接收消息："+System.currentTimeMillis()/1000);
        return "Hello,要下课吗";
    }

}
