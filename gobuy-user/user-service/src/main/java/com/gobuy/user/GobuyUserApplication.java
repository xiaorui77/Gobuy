package com.gobuy.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gobuy.user.mapper")
public class GobuyUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(GobuyUserApplication.class, args);
    }
}
