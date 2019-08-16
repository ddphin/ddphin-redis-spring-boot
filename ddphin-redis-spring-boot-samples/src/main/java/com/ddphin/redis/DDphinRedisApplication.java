package com.ddphin.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class DDphinRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DDphinRedisApplication.class, args);
    }
}
