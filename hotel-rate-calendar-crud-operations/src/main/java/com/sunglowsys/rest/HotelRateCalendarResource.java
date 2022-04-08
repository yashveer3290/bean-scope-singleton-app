package com.sunglowsys.rest;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.service.HotelRateCalendarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelRateCalendarResource {
    private static final Logger LOGGER =  LoggerFactory.getLogger(HotelRateCalendarResource.class);

    private final HotelRateCalendarService hotelRateCalendarService;

    public HotelRateCalendarResource(HotelRateCalendarService hotelRateCalendarService) {
        this.hotelRateCalendarService = hotelRateCalendarService;
    }


    @PostMapping("/hotel-rate-calendars")
    public ResponseEntity<HotelRateCalendar> createHotelRateCalendar(@RequestBody HotelRateCalendar hotelRateCalendar){
        HotelRateCalendar result = hotelRateCalendarService.save(hotelRateCalendar);
        return ResponseEntity.ok(result);

    }
    @GetMapping("/hotel-rate-calendars")
    public ResponseEntity<List<HotelRateCalendar>> getALl(){
        List<HotelRateCalendar> result = hotelRateCalendarService.findAll();
        return ResponseEntity.ok().body(result);
    }
    @GetMapping("/hotel-rate-calendars/{id}")
    public  HotelRateCalendar getBYId(@PathVariable("id") Long id){
        return hotelRateCalendarService.findId(id);
    }
    @PutMapping("/hotel-rate-calendars/{id}")
    public HotelRateCalendar update(@RequestBody HotelRateCalendar hotelRateCalendar,@PathVariable("id")Long id){
        return hotelRateCalendarService.update(hotelRateCalendar,id);
    }
    @DeleteMapping("/hotel-rate-calendars/{id}")
    public void delete(@PathVariable("id") Long id){
        hotelRateCalendarService.delete(id);
    }
}




