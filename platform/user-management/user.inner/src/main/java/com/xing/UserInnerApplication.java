package com.xing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiexingxing
 * @Created by 2019-11-17 20:59.
 */
@MapperScan("com.xing.dao")
@SpringBootApplication
@EnableEurekaClient
public class UserInnerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserInnerApplication.class, args);
    }

}