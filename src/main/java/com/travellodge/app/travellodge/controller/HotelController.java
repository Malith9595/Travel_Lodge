package com.travellodge.app.travellodge.controller;

import com.travellodge.app.travellodge.model.Hotel;
import com.travellodge.app.travellodge.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotel") //path variable
    public Hotel createHotel(@RequestBody Hotel newHotel) {
        return hotelService.createHotel(newHotel);
    }

    @GetMapping("/hotel/{hotelId}")
    Hotel getHotelById(@PathVariable Long hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @PutMapping("/hotel/{hotelId}")
    public Hotel updateHotel(@PathVariable Long hotelId, @RequestBody Hotel updatedHotel) {
        return hotelService.updateHotel(hotelId, updatedHotel);
    }

    @DeleteMapping("/hotel/{hotelId}")
    void deleteHotelById(@PathVariable Long hotelId) {
        hotelService.deleteHotelById(hotelId);
    }


}
