package com.tcs.srs.paymentservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "payment_id", nullable = false)
    private Integer id;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name = "booking_number")
    private Integer bookingNumber;

    @Column(name = "status", length = 10)
    private String status;

}