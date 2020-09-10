package com.travellodge.app.travellodge.repository;

import com.travellodge.app.travellodge.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository <Booking, Long> {
}
