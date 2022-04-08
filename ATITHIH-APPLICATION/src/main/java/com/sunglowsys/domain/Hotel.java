package com.sunglowsys.domain;

import java.util.Objects;

public class Hotel {
    private Integer id;
    private String code;
    private String name;
    private String type;
    private String mobile;
    private Integer address_id;

    public Hotel(){}

    public Hotel(String code, String name, String type, String mobile, Integer address_id) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.mobile = mobile;
        this.address_id = address_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(code, hotel.code) && Objects.equals(name, hotel.name) && Objects.equals(type, hotel.type) && Objects.equals(mobile, hotel.mobile) && Objects.equals(address_id, hotel.address_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, type, mobile, address_id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address_id=" + address_id +
                '}';
    }
}
