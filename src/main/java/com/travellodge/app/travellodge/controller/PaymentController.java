package com.travellodge.app.travellodge.controller;

import com.travellodge.app.travellodge.model.PaymentDetail;
import com.travellodge.app.travellodge.model.User;
import com.travellodge.app.travellodge.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment") //
    public PaymentDetail createPayment(@RequestBody PaymentDetail newPayment){
        return paymentService.createPayment(newPayment);
    }
    @GetMapping("/payment/{paymentId}")
    PaymentDetail getPaymentById(@PathVariable Long paymentId) {
        return paymentService.getPaymentById(paymentId);
    }

    @PutMapping("/payment/{paymentId}")
    public PaymentDetail updatePayment(@PathVariable Long paymentId, @RequestBody PaymentDetail updatePayment){
        return paymentService.updatePayment(paymentId, updatePayment);
    }
}