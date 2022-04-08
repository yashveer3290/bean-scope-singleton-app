package com.sunglowsys.domain;

import java.util.Objects;

public class HotelBooking {
    private Integer id;
    private String checkInDate;
    private String checkOutDate;
    private String totalGuest;
    private String noOfNights;
    private String noOfRooms;
    private String bookingAmount;
    private Integer customer_id;
    private Integer hotel_id;
    private Integer roomType_id;
    private Integer ratePlan_id;

    public HotelBooking(){}

    public HotelBooking(String checkInDate, String checkOutDate, String totalGuest, String noOfNights, String noOfRooms, String bookingAmount, Integer customer_id, Integer hotel_id, Integer roomType_id, Integer ratePlan_id) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.noOfNights = noOfNights;
        this.noOfRooms = noOfRooms;
        this.bookingAmount = bookingAmount;
        this.customer_id = customer_id;
        this.hotel_id = hotel_id;
        this.roomType_id = roomType_id;
        this.ratePlan_id = ratePlan_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(String totalGuest) {
        this.totalGuest = totalGuest;
    }

    public String getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(String noOfNights) {
        this.noOfNights = noOfNights;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(String bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
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

    public Integer getRatePlan_id() {
        return ratePlan_id;
    }

    public void setRatePlan_id(Integer ratePlan_id) {
        this.ratePlan_id = ratePlan_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNights, that.noOfNights) && Objects.equals(noOfRooms, that.noOfRooms) && Objects.equals(bookingAmount, that.bookingAmount) && Objects.equals(customer_id, that.customer_id) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(roomType_id, that.roomType_id) && Objects.equals(ratePlan_id, that.ratePlan_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, noOfNights, noOfRooms, bookingAmount, customer_id, hotel_id, roomType_id, ratePlan_id);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest='" + totalGuest + '\'' +
                ", noOfNights='" + noOfNights + '\'' +
                ", noOfRooms='" + noOfRooms + '\'' +
                ", bookingAmount='" + bookingAmount + '\'' +
                ", customer_id=" + customer_id +
                ", hotel_id=" + hotel_id +
                ", roomType_id=" + roomType_id +
                ", ratePlan_id=" + ratePlan_id +
                '}';
    }
}
