package com.suglowsys.repository;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }
}
