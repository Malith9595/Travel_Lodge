package com.travellodge.app.travellodge.service;

import com.travellodge.app.travellodge.model.Booking;
import com.travellodge.app.travellodge.model.User;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking getBookingById(Long bookingid);
    Booking updateBooking(Long bookingid, Booking updatedBooking);

}
