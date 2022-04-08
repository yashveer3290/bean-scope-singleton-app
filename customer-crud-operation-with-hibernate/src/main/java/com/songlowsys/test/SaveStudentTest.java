package com.songlowsys.test;

import com.songlowsys.domain.Student;
import com.songlowsys.service.StudentService;
import com.songlowsys.service.StudentServiceImpl;

public class SaveStudentTest {

    public static void main(String[] args) {
        Student student = new Student("Hirdesh", "Kumar", "hirdesh01198@gmail","8598099098");

         new StudentServiceImpl().save(student);

        System.out.println(student);


    }
}
