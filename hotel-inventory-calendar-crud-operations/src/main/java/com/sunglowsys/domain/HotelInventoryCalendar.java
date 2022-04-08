package com.sunglowsys.domain;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "hotel-inventory-calendar")
public class HotelInventoryCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long available;
    private Long sold;
    private Long block;
    private Long hotelId;
    private Long roomTypeId;

    public HotelInventoryCalendar(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAvailable() {
        return available;
    }

    public void setAvailable(Long available) {
        this.available = available;
    }

    public Long getSold() {
        return sold;
    }

    public void setSold(Long sold) {
        this.sold = sold;
    }

    public Long getBlock() {
        return block;
    }

    public void setBlock(Long block) {
        this.block = block;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventoryCalendar that = (HotelInventoryCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(available, that.available) && Objects.equals(sold, that.sold) && Objects.equals(block, that.block) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, available, sold, block, hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelInventoryCalendar{" +
                "id=" + id +
                ", available=" + available +
                ", sold=" + sold +
                ", block=" + block +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
