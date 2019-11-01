package com.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;

@Configuration
@Profile("test")
public class TestConfiguration {
    @Bean
    public Connection getSystem(){
        Connection con=null;
        System.out.println("Inside Test System");
        return con;
    }
}
