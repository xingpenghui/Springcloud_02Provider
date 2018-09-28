package com.feri.springcloud_02provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//标记是客户端
@MapperScan("com.feri.springcloud_02provider.mapper")
public class Springcloud02providerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud02providerApplication.class, args);
    }
}
