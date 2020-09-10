package com.travellodge.app.travellodge.service;

import com.travellodge.app.travellodge.model.PaymentDetail;
import com.travellodge.app.travellodge.model.User;

public interface PaymentService {
    PaymentDetail createPayment(PaymentDetail paymentDetail);
    PaymentDetail getPaymentById(Long paymentId);
    PaymentDetail updatePayment(Long paymentId, PaymentDetail updatePayment);
}
