package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "rate-plans")
public class RatePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long hotelId;
    private Long roomTypeId;

    public RatePlan(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(id, ratePlan.id) && Objects.equals(name, ratePlan.name) && Objects.equals(hotelId, ratePlan.hotelId) && Objects.equals(roomTypeId, ratePlan.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotelId, roomTypeId);
    }
}
