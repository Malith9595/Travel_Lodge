package com.travellodge.app.travellodge.service.impl;

import com.travellodge.app.travellodge.model.Booking;
import com.travellodge.app.travellodge.repository.BookingRepository;
import com.travellodge.app.travellodge.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(Long bookingid) {
        return null;
    }

    @Override
    public Booking updateBooking(Long bookingid, Booking updatedBooking) {
        bookingRepository.findById(bookingid).get();

        return null;
    }
}
