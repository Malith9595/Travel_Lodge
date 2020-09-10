package com.travellodge.app.travellodge.repository;

import com.travellodge.app.travellodge.model.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDetail, Long> {
}
