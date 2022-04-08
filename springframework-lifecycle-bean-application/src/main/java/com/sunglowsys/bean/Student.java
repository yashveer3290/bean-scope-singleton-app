package com.sunglowsys.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {

    public void start(){
        System.out.println("start is called");
    }

    @PostConstruct
    public  void init() throws  Exception{
        System.out.println("obj is created");
    }

    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("obj is destroyed");
    }

    public void last(){
        System.out.println("last method called");

    }
}
