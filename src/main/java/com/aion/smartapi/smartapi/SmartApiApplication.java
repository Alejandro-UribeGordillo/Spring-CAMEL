package com.aion.smartapi.smartapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartApiApplication {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/smartApi");
        SpringApplication.run(SmartApiApplication.class, args);
    }

}
