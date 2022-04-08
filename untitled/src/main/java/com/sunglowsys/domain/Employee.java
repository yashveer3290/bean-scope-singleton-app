package com.sunglowsys.domain;

public class Employee {
    private int id;
    private String firstName;
    private String lastNsame;

    public void getFirstName() {
        System.out.println("firstName:"+firstName);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastNsame() {
        System.out.println("lastName:"+lastNsame);
    }

    public void setLastNsame(String lastNsame) {
        this.lastNsame = lastNsame;
    }
}
