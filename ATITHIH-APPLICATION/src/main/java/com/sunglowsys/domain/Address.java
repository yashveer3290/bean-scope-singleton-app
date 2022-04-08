package com.sunglowsys.domain;

import java.util.Objects;

public class Address {
    private Integer id;
    private String addressLine1;
    private String addressLine2;
    private String street;
    private String state;
    private String country;
    private Integer zipcode;

    public Address(){}

    public Address(String addressLine1, String addressLine2, String street, String state, String country, Integer zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.street = street;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(addressLine2, address.addressLine2) && Objects.equals(street, address.street) && Objects.equals(state, address.state) && Objects.equals(country, address.country) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressLine1, addressLine2, street, state, country, zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
