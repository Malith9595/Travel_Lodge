package com.travellodge.app.travellodge.repository;

import com.travellodge.app.travellodge.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <Hotel, Long> {
}
