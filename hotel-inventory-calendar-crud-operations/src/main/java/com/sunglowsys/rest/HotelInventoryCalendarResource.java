package com.sunglowsys.rest;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.service.HotelInventoryCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HotelInventoryCalendarResource {
    private static final Logger LOGGER=  LoggerFactory.getLogger(HotelInventoryCalendarResource.class);
    public final HotelInventoryCalendarService hotelInventoryCalendarService;

    public HotelInventoryCalendarResource(HotelInventoryCalendarService hotelInventoryCalendarService) {
        this.hotelInventoryCalendarService = hotelInventoryCalendarService;
    }
    @PostMapping("/hotel-inventory-calendars")
    public ResponseEntity<HotelInventoryCalendar> createHotelInventoryCalendar(@RequestBody HotelInventoryCalendar hotelInventoryCalendar){
        HotelInventoryCalendar result = hotelInventoryCalendarService.save(hotelInventoryCalendar);
        return ResponseEntity.ok(result);
    }
}
