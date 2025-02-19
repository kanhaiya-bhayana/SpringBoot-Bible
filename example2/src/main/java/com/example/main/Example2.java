package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Kia Seltos");
        System.out.println("Vehicle name from the non-spring context is: " + vehicle.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("kiaVehicle",Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh.getName());
    }
}
