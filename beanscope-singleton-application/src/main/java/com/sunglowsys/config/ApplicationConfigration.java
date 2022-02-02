package com.sunglowsys.config;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfigration {
    @Bean
   @Scope("singletone")
    public Student getStudent(){
        return new Student();
    }

    /*@Bean
    @Scope("singletone")
    public Address getAddress(){
        return new Address();
    }*/
}
