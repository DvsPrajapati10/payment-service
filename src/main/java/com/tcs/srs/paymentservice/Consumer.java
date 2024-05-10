package com.tcs.srs.paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class Consumer
{

    @Autowired
    PaymentService paymentService;

    @Autowired
    Producer producer;

    Payment payment;

    @KafkaListener(topics = "payment", groupId = "group_id")
    public void consume(String message) {
        String payload[]= message.split(":");
        this.payment = new Payment();
        this.payment.setId((int) (Math.random()*100000) );
        this.payment.setStatus(payload[0]);
        this.payment.setBookingNumber(Integer.parseInt(payload[1]));
        this.payment.setDateOfPayment(LocalDate.now());
        paymentService.createPayment(this.payment);
        producer.sendPaymentProcessPayload("SUCCESS", payload[1]);
    }
}