package com.foodordering.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderserviceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(OrderserviceApplication.class, args);
        String buildVersion = context.getEnvironment().getProperty("build.version");
        System.out.println("Build version: " + buildVersion);
    }

}
