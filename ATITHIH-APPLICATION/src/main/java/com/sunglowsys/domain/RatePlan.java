package com.sunglowsys.domain;

import java.util.Objects;

public class RatePlan {
    private Integer id;
    private String name;
    private Integer hotel_id;
    private Integer roomType_id;

    public RatePlan(){}

    public RatePlan(String name, Integer hotel_id, Integer roomType_id) {
        this.name = name;
        this.hotel_id = hotel_id;
        this.roomType_id = roomType_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoomType_id() {
        return roomType_id;
    }

    public void setRoomType_id(Integer roomType_id) {
        this.roomType_id = roomType_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(id, ratePlan.id) && Objects.equals(name, ratePlan.name) && Objects.equals(hotel_id, ratePlan.hotel_id) && Objects.equals(roomType_id, ratePlan.roomType_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotel_id, roomType_id);
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotel_id=" + hotel_id +
                ", roomType_id=" + roomType_id +
                '}';
    }
}
