package com.sunglowsys.service;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeServiceImpl implements RoomTypeService{

    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public RoomType save(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }

    @Override
    public RoomType update(RoomType roomType, Long id) {
        RoomType roomType1 = roomTypeRepository.getById(id);
        roomType1.setName(roomType.getName());
        return roomTypeRepository.save(roomType1);
    }

    @Override
    public List<RoomType> findAll() {
        return roomTypeRepository.findAll();
    }

    @Override
    public RoomType findById(Long id) {
        Optional<RoomType>optional = roomTypeRepository.findById(id);
        RoomType roomType= null;
        if (optional.isPresent()) {
            roomType = optional.get();
        }
        else {
            throw new RuntimeException("roomType is not available for this id" + id);
        }

        return roomType;
    }

    @Override
    public void delete(Long id) {
        roomTypeRepository.deleteById(id);

    }
}
