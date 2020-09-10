package com.travellodge.app.travellodge.controller;

import com.travellodge.app.travellodge.model.Booking;
import com.travellodge.app.travellodge.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/booking")
    public Booking createBooking(@RequestBody Booking newBooking){
        return bookingService.createBooking(newBooking);
    }
    @GetMapping("/booking/{bookingid}")
    Booking getBookingById(@PathVariable Long bookingId) {
        return bookingService.getBookingById(bookingId);
    }


    @PutMapping("/booking/{bookingid}")
    public Booking updateBooking(@PathVariable Long bookingId, @RequestBody Booking updatedBooking){
        return bookingService.updateBooking(bookingId, updatedBooking);
    }

}
