package com.payment.collection.controller;

import com.payment.collection.controller.exception.InsufficientFundsError;
import com.payment.collection.controller.exception.TransactionNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PaymentExceptionHandler {

    @ExceptionHandler(InsufficientFundsError.class)
    public ResponseEntity insufficientFund(){
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @ExceptionHandler(TransactionNotFoundError.class)
    public ResponseEntity transacTionNotFound(){
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
