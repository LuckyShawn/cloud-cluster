package com.shawn.provider7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider7002Application.class, args);
    }

}

