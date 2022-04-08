package com.sunglowsys.rest;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.service.RoomTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomTypeResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(RoomTypeResource.class);

    private final RoomTypeService roomTypeService;

    public RoomTypeResource(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }
    @PostMapping("/room-types")
    public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType){
        RoomType result = roomTypeService.save(roomType);
        return ResponseEntity.
                ok(result);
    }
    @GetMapping("/room-types")
    public List<RoomType> getFindAll(){
        List<RoomType> roomTypes =roomTypeService.findAll();
        return roomTypes;
    }
    @GetMapping("room-types/{id}")
    public RoomType getById(@PathVariable("id") Long id){
        return roomTypeService.findById(id);
    }
    @PutMapping("/room-types/{id}")
    public RoomType update(@RequestBody RoomType roomType, @PathVariable("id") Long id){
        return roomTypeService.update(roomType,id);
    }
    @DeleteMapping("room-types/{id}")
    public void delete(@PathVariable("id") Long id){
    roomTypeService.delete(id);
    }
}