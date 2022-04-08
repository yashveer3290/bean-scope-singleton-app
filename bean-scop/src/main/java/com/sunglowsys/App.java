package com.sunglowsys;

import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.domain");
        context.refresh();

        Student student = context.getBean(Student.class);

        student.setFirstName("shiley");
        System.out.println(student.getFirstName());

        Student student1 = context.getBean(Student.class);
        student1.setFirstName("Yashveer");
        System.out.println(student1.getFirstName());
    }
}
