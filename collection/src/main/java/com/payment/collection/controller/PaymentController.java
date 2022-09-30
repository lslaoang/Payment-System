package com.payment.collection.controller;

import com.payment.collection.controller.exception.TransactionNotFoundError;
import com.payment.collection.service.PaymentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    private final PaymentServiceImpl paymentService;

    public PaymentController(PaymentServiceImpl paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/transactions")
    public ResponseEntity getAllTransaction(){
        try {
            paymentService.displayAllData();
            return new ResponseEntity(paymentService.displayAllData(), HttpStatus.OK);
        }catch (Exception e) {
            throw new TransactionNotFoundError();
        }
    }
}
