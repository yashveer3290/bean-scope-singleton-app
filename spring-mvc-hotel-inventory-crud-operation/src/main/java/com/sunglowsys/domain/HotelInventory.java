package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="hotel_inventory")
public class HotelInventory {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    private String totalInventory;
    private Integer hotelId;
    private Integer roomTypeId;

    public HotelInventory(){}

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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventory that = (HotelInventory) o;
        return Objects.equals(id, that.id) && Objects.equals(totalInventory, that.totalInventory) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalInventory, hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelInventory{" +
                "id=" + id +
                ", totalInventory='" + totalInventory + '\'' +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
