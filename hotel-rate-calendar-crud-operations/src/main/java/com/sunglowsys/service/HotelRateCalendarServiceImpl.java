package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.repository.HotelRateCalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HotelRateCalendarServiceImpl implements HotelRateCalendarService {
    private final HotelRateCalendarRepository hotelRateCalendarRepository;


    public HotelRateCalendarServiceImpl(HotelRateCalendarRepository hotelRateCalendarRepository) {
        this.hotelRateCalendarRepository = hotelRateCalendarRepository;
    }
    @Override
    public HotelRateCalendar save(HotelRateCalendar hotelRateCalendar) {

        return hotelRateCalendarRepository.save(hotelRateCalendar);
    }



    @Override
    public HotelRateCalendar update(HotelRateCalendar hotelRateCalendar, Long id) {
        HotelRateCalendar hotelRateCalendar1 = hotelRateCalendarRepository.getById(id);
        hotelRateCalendar1.setExtraChildPrice(hotelRateCalendar.getExtraChildPrice());
        return  hotelRateCalendarRepository.save(hotelRateCalendar1);
    }


    @Override
    public List<HotelRateCalendar> findAll() {
        return hotelRateCalendarRepository.findAll();
    }


    @Override
    public HotelRateCalendar findId(Long id) {
        Optional<HotelRateCalendar> optional = hotelRateCalendarRepository.findById(id);
        HotelRateCalendar hotelRateCalendar= null;
        if(optional.isPresent()){
            hotelRateCalendar = optional.get();
        }
        else {
            throw new RuntimeException("hotel-rate-calendar is not available for this id" + id);
        }
        return hotelRateCalendar;
    }


    @Override
    public void delete(Long id) {
        hotelRateCalendarRepository.deleteById(id);
    }
}
