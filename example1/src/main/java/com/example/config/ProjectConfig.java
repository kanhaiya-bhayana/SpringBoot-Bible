package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    /*
        The method names usually follow verbs notation, But for methods which
        we will use to create beans, can use nouns as names.
        This will be a good practice as the method names will become
        bean names as well in the context.
     */

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 13;
    }
}
