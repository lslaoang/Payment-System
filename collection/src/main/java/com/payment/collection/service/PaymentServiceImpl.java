package com.payment.collection.service;

import com.payment.collection.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public List<Transaction> displayAllData() {
        return Collections.emptyList();
    }
}
