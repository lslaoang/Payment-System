package com.payment.collection.service;

import com.payment.collection.model.Transaction;
import com.payment.collection.repo.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Transaction> displayAllData() {
        return paymentRepository.findAll();
    }
}
