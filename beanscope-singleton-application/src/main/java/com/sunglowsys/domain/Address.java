package com.sunglowsys.domain;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String zipcode;

    public Address(){
        System.out.println("Address object is created");
    }

    public Address(Long id, String addressLine1, String addressLine2, String state, String zipcode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void checkAddress(){
        System.out.println("Id:"+1002);
        System.out.println("AddressLine1:"+"BhavanNagar");
        System.out.println("AddressLine2:"+"Marehra");
        System.out.println("State:"+"Etha");
        System.out.println("Zipcode"+"207401");
    }
}
