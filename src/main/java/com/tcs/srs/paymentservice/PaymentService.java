package com.tcs.srs.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    public PaymentRepository paymentRepository;

    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }
    public void createPayment(Payment payment){
        paymentRepository.save(payment);
    }
}
