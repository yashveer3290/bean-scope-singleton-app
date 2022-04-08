package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelInventoryServiceImpl implements HotelInventoryService {

    private final HotelInventoryRepository hotelInventoryRepository;

    public HotelInventoryServiceImpl(HotelInventoryRepository hotelInventoryRepository) {
        this.hotelInventoryRepository = hotelInventoryRepository;
    }

    @Override
    public HotelInventory save(HotelInventory hotelInventory) {
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public HotelInventory update(HotelInventory hotelInventory, Integer id) {
        HotelInventory result = hotelInventoryRepository.findById(id).get();
        result.setTotalInventory(result.getTotalInventory());
        result.setHotelId(result.getHotelId());
        result.setRoomTypeId(result.getRoomTypeId());

        return hotelInventoryRepository.save(result);
    }

    @Override
    public List<HotelInventory> findAll() {
        return hotelInventoryRepository.findAll();
    }

    @Override
    public HotelInventory findById(Integer id) {
        return hotelInventoryRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        hotelInventoryRepository.deleteById(id);
    }

}
