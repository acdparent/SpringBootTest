package com.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Connection;

@Configuration
@Profile("dev")
public class DevConfiguration {

    @Bean
    public Connection getSystem(){
        Connection con=null;
        System.out.println("Inside Dev");
        return con;
    }
}
