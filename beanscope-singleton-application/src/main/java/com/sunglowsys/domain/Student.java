package com.sunglowsys.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class Student {
    private Long id;
    private String firstName;
    private String lastNAme;
    private String mobile;

    public Student(){
        System.out.println("Student object is created");
    }

    public Student(Long id, String firstName, String lastNAme, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
