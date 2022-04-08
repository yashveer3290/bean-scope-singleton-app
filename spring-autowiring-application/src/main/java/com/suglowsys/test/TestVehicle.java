package com.suglowsys.test;

import com.suglowsys.repository.Vehicle;
import com.suglowsys.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestVehicle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.suglowsys.repository");
        context.scan("com.suglowsys.service");
        context.refresh();

        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.service();

        context.close();
    }
}
