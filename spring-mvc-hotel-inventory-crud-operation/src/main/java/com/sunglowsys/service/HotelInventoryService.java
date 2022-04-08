package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;

import java.util.List;

public interface HotelInventoryService {

    HotelInventory save(HotelInventory hotelInventory);

    HotelInventory update(HotelInventory hotelInventory, Integer id);

    List<HotelInventory> findAll();

    HotelInventory findById(Integer id);

    void delete(Integer id);

}
