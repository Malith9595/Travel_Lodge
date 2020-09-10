package com.travellodge.app.travellodge.service.impl;

import com.travellodge.app.travellodge.model.PaymentDetail;
import com.travellodge.app.travellodge.repository.PaymentRepository;
import com.travellodge.app.travellodge.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentDetail createPayment(PaymentDetail payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public PaymentDetail getPaymentById(Long paymentId) {
        return paymentRepository.findById(paymentId).get();
    }

    @Override
    public PaymentDetail updatePayment(Long paymentId, PaymentDetail updatePayment) {
        return null;
    }
//payment status
}
