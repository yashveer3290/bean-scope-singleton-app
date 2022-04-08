package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;

import java.util.List;

public interface HotelInventoryCalendarService {
    HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar);

    HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar, Long id);

    List<HotelInventoryCalendar> findAll();

    HotelInventoryCalendar findId(Integer id);

    void delete(Integer id);
}
