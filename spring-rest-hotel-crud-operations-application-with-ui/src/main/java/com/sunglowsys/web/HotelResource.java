package com.sunglowsys.web;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HotelResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(HotelResource.class);
    private final HotelService hotelService;

    public HotelResource(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public ModelAndView home() {
        LOGGER.debug("Web request to go to home page Hotels");
        Page<Hotel> page = hotelService.findAll(PageRequest.of(0, 20));
        return new ModelAndView("index", "hotels", page.getContent());
    }

    @GetMapping("/hotels")
    public ModelAndView createHotelForm(){
        LOGGER.debug("web request to load Hotel form");
        return new ModelAndView("add-hotel","hotel",new Hotel());
    }

    @PostMapping("/hotels")
    public String createHotel(@ModelAttribute Hotel hotel){
        LOGGER.debug("we request to create Hotel: {}",hotel);
        hotelService.save(hotel);
        return "redirect:/";
    }

    @GetMapping("/hotels/{id}")
    public ModelAndView updateHotel(@PathVariable Long id){
        LOGGER.debug("web request to update Hotel :{}" ,id);
        return new ModelAndView("add-hotel","hotel",hotelService.findById(id).get());
    }

    @GetMapping("/hotels/delete/{id}")
    public String deleteHotel(@PathVariable Long id){
        LOGGER.debug("web request to delete Hotel : {}",id);
        hotelService.delete(id);
        return "redirect:/";
    }

}
