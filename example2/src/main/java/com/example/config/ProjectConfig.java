package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean(value = "hyundaiVehicle")
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Hyundai");
        return veh;
    }
    @Bean("kiaVehicle")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Kia");
        return veh;
    }
}
