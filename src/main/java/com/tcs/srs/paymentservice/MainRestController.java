package com.tcs.srs.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainRestController {


    @Autowired
    public PaymentService paymentService;
    @GetMapping("/get/all/payments")
    public ResponseEntity<List<Payment>> getAllPayments(){
        return new ResponseEntity<>(paymentService.getAllPayments(), HttpStatus.OK);
    }

}
