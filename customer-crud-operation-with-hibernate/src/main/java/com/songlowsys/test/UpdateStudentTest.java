package com.songlowsys.test;

import com.songlowsys.domain.Student;
import com.songlowsys.service.StudentService;
import com.songlowsys.service.StudentServiceImpl;

public class UpdateStudentTest {

    public static void main(String[] args) {
        Student student = new Student("Govid", "Kumar", "govind@gmail.com", "5687567895");

        new StudentServiceImpl().save(student);

        System.out.println(student);
    }
}
