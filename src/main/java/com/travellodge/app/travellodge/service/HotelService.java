package com.travellodge.app.travellodge.service;

import com.travellodge.app.travellodge.model.Hotel;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    Hotel getHotelById(Long hotelId);
    Hotel updateHotel(Long hotelId, Hotel updatedHotel);
    void deleteHotelById(Long hotelId);
}
