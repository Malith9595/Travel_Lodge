package com.travellodge.app.travellodge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PaymentDetail {
    @Id
    @GeneratedValue
    private Long paymentId;
    private String email;
    private String name;
    private String phone;
    private String productInfo;
    private String amount;
    private String hash;
    private String billingAddress;
    private String payment_approved;
    private String payment_decline;
    private String payment_cancelled;
    private String cardNo;
    private String cardName;
    private String cvvNo;
    private String expiryDate;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPayment_approved() {
        return payment_approved;
    }

    public void setPayment_approved(String payment_approved) {
        this.payment_approved = payment_approved;
    }

    public String getPayment_decline() {
        return payment_decline;
    }

    public void setPayment_decline(String payment_decline) {
        this.payment_decline = payment_decline;
    }

    public String getPayment_cancelled() {
        return payment_cancelled;
    }

    public void setPayment_cancelled(String payment_cancelled) {
        this.payment_cancelled = payment_cancelled;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(String cvvNo) {
        this.cvvNo = cvvNo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
