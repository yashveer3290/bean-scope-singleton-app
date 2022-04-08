package com.sunglowsys.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "hotel_type")
    private String hotelType;

    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "mobile")
    private String mobile;

    public Hotel(){}

    public Hotel(String code, String name, String hotelType, String email, String mobile) {
        this.code = code;
        this.name = name;
        this.hotelType = hotelType;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(code, hotel.code) && Objects.equals(name, hotel.name) && Objects.equals(hotelType, hotel.hotelType) && Objects.equals(email, hotel.email) && Objects.equals(mobile, hotel.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, hotelType, email, mobile);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hotelType='" + hotelType + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
