package com.sunglowsys.domain;

import java.util.Objects;

public class HotelInventory {
    private Integer id;
    private String totalInventory;
    private Integer hotel_id;
    private Integer roomType_id;

    public HotelInventory(){}

    public HotelInventory(String totalInventory, Integer hotel_id, Integer roomType_id) {
        this.totalInventory = totalInventory;
        this.hotel_id = hotel_id;
        this.roomType_id = roomType_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(String totalInventory) {
        this.totalInventory = totalInventory;
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
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(roomType_id, that.roomType_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hotel_id, roomType_id);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory='" + totalInventory + '\'' +
                ", hotel_id=" + hotel_id +
                ", roomType_id=" + roomType_id +
                '}';
    }
}
