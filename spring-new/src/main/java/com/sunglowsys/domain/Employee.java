package com.sunglowsys.domain;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public void getFirstName() {
        System.out.println("firstName:"+firstName);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println("lastName:"+lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
