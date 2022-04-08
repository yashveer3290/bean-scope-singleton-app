package com.sunglowsys.test;

import com.sunglowsys.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();

        context.scan("com.sunglowsys.bean");
        context.refresh();

        Student student = context.getBean(Student.class);

        student.start();
        student.last();
        context.close();
    }
}
