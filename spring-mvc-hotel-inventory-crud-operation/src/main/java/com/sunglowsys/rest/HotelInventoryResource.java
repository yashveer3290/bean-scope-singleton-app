package com.sunglowsys.rest;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.service.HotelInventoryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;


@RestController
@RequestMapping("/api")
public class HotelInventoryResource {

    private static final Logger log = LoggerFactory.getLogger(HotelInventoryResource.class);

    private final HotelInventoryService hotelInventoryService;

    public HotelInventoryResource(HotelInventoryService hotelInventoryService) {
        this.hotelInventoryService = hotelInventoryService;
    }

    @PostMapping("/hotel-inventories")
    public ResponseEntity<HotelInventory> createHotelInventory(@RequestBody HotelInventory hotelInventory){
        log.debug("REST request to create HotelInventory / {} ",hotelInventory);
        HotelInventory result = hotelInventoryService.save(hotelInventory);
        return ResponseEntity
                .ok().body(result);
    }
    @GetMapping("/hotel-inventories")
    public ResponseEntity<List<HotelInventory>> getALl(){
        log.debug("REST request to create HotelInventory / {} ");
        List<HotelInventory> result = hotelInventoryService.findAll();
        return ResponseEntity
                .ok()
                .body(result);
    }
    @GetMapping("/hotel-inventories/{id}")
    public ResponseEntity<?> findHotelInventoryById(@PathVariable Integer id){
        HotelInventory result = hotelInventoryService.findById(id);
        return ResponseEntity
                .ok()
                .body(result);
    }
    @PutMapping("/hotel-inventories/{id}")
    public HotelInventory update(@RequestBody HotelInventory hotelInventory,@PathVariable("id")Integer id){
        return hotelInventoryService.update(hotelInventory,id);
    }


}

