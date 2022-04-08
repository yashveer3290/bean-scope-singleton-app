package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "hotel_rate_calendars")
public class HotelRateCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long singleOccupancy;

    private Long doubleOccupancy;

    private Long extraAdultPrice;

    private Long extraChildPrice;

    private Long applicableDays;

    private Long hotelId;

    private Long hotelRoomType;

    public HotelRateCalendar(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSingleOccupancy() {
        return singleOccupancy;
    }

    public void setSingleOccupancy(Long singleOccupancy) {
        this.singleOccupancy = singleOccupancy;
    }

    public Long getDoubleOccupancy() {
        return doubleOccupancy;
    }

    public void setDoubleOccupancy(Long doubleOccupancy) {
        this.doubleOccupancy = doubleOccupancy;
    }

    public Long getExtraAdultPrice() {
        return extraAdultPrice;
    }

    public void setExtraAdultPrice(Long extraAdultPrice) {
        this.extraAdultPrice = extraAdultPrice;
    }

    public Long getExtraChildPrice() {
        return extraChildPrice;
    }

    public void setExtraChildPrice(Long extraChildPrice) {
        this.extraChildPrice = extraChildPrice;
    }

    public Long getApplicableDays() {
        return applicableDays;
    }

    public void setApplicableDays(Long applicableDays) {
        this.applicableDays = applicableDays;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getHotelRoomType() {
        return hotelRoomType;
    }

    public void setHotelRoomType(Long hotelRoomType) {
        this.hotelRoomType = hotelRoomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRateCalendar that = (HotelRateCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(singleOccupancy, that.singleOccupancy) && Objects.equals(doubleOccupancy, that.doubleOccupancy) && Objects.equals(extraAdultPrice, that.extraAdultPrice) && Objects.equals(extraChildPrice, that.extraChildPrice) && Objects.equals(applicableDays, that.applicableDays) && Objects.equals(hotelId, that.hotelId) && Objects.equals(hotelRoomType, that.hotelRoomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, singleOccupancy, doubleOccupancy, extraAdultPrice, extraChildPrice, applicableDays, hotelId, hotelRoomType);
    }

    @Override
    public String toString() {
        return "HotelRateCalendar{" +
                "id=" + id +
                ", singleOccupancy=" + singleOccupancy +
                ", doubleOccupancy=" + doubleOccupancy +
                ", extraAdultPrice=" + extraAdultPrice +
                ", extraChildPrice=" + extraChildPrice +
                ", applicableDays=" + applicableDays +
                ", hotelId=" + hotelId +
                ", hotelRoomType=" + hotelRoomType +
                '}';
    }
}
