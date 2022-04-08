package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalendar;

import java.util.List;

public interface HotelRateCalendarService {
    HotelRateCalendar save(HotelRateCalendar hotelRateCalendar);

    HotelRateCalendar update(HotelRateCalendar hotelRateCalendar,Long id);

    List<HotelRateCalendar> findAll();



    HotelRateCalendar findId(Long id);

    void delete(Long id);


}
