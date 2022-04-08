package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.repository.HotelInventoryCalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelInventoryCalendarServiceImpl implements HotelInventoryCalendarService{

    private final HotelInventoryCalendarRepository hotelInventoryCalendarRepository;

    public HotelInventoryCalendarServiceImpl(HotelInventoryCalendarRepository hotelInventoryCalendarRepository) {
        this.hotelInventoryCalendarRepository = hotelInventoryCalendarRepository;
    }

    @Override
    public HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar) {
        return hotelInventoryCalendarRepository.save(hotelInventoryCalendar);
    }

    @Override
    public HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar, Long id) {
        return null;
    }

    @Override
    public List<HotelInventoryCalendar> findAll() {
        return null;
    }

    @Override
    public HotelInventoryCalendar findId(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
