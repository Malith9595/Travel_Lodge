package com.travellodge.app.travellodge.service.impl;

import com.travellodge.app.travellodge.model.Hotel;
import com.travellodge.app.travellodge.repository.HotelRepository;
import com.travellodge.app.travellodge.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel createHotel(Hotel hotel) {return hotelRepository.save(hotel);}

    @Override
    public Hotel getHotelById (Long hotelId) {return hotelRepository.findById(hotelId).get();}

    @Override
    public Hotel updateHotel(Long hotelId, Hotel updatedHotel) {
        Optional<Hotel> existingHotelOptional = hotelRepository.findById(hotelId);
        if(existingHotelOptional.isPresent()){ //if the user alredy in update or return null,
            Hotel existingHotel = existingHotelOptional.get();
            existingHotel.setAddress(existingHotel.getAddress());
            existingHotel.setLocation(existingHotel.getLocation());
            existingHotel.setName(existingHotel.getName());
            existingHotel.setNoOfRooms(existingHotel.getNoOfRooms());
            existingHotel.setTelephone(existingHotel.getTelephone());
            return hotelRepository.save(existingHotel);}

        return null;
    }

    @Override
    public void deleteHotelById(Long hotelId) {hotelRepository.deleteById(hotelId);}{

    }
}
