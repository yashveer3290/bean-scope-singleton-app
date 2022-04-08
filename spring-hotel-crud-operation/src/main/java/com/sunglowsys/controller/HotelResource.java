package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelResource {


    private static final Logger LOGGER = LoggerFactory.getLogger(HotelResource.class);
     private final HotelService hotelService;

    public HotelResource(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/hotels")
      public Hotel save(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }
    @GetMapping("/hotels")
    public List<Hotel> getAll(){
        List<Hotel>hotels = hotelService.findAll();
        return hotels;
    }
    @GetMapping("/hotels/{id}")
    public Hotel getById(@PathVariable("id") Integer id) {
        return hotelService.findId(id);

    }
    @PutMapping("/hotels/{id}")
    public Hotel update(@RequestBody Hotel hotel, @PathVariable("id") Integer id){
        return hotelService.update(hotel,id);

    }
    @DeleteMapping("/hotels/{id}")
    public void delete(@PathVariable("id") Integer id){
        hotelService.delete(id);
    }


}
