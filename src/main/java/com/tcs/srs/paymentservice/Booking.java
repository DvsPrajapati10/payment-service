package com.tcs.srs.paymentservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @Column(name = "booking_number", nullable = false, length = 20)
    private String bookingNumber;

    //TODO [JPA Buddy] generate columns from DB
}