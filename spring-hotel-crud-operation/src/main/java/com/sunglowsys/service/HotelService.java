package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;

import java.util.List;

public interface HotelService {

    Hotel save (Hotel hotel);

    Hotel update(Hotel hotel,Integer id);

    List<Hotel>findAll();

    Hotel findId(Integer id);

    void delete(Integer id);

}
