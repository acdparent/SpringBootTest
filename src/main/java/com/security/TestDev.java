package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
@ComponentScan({"com.security.configuration","com.security.controller"})
public class TestDev extends SpringBootServletInitializer {

    public static void main(String args[]){
        SpringApplication.run(TestDev.class, args);

    }

}
