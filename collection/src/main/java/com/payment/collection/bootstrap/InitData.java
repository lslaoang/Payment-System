package com.payment.collection.bootstrap;

import com.payment.collection.model.Transaction;
import com.payment.collection.repo.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class InitData implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public InitData(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) {
        Transaction transaction = new Transaction();
        transaction.setId("util-1");
        transaction.setName("Meralco");
        transaction.setAmount(new BigDecimal("1000.2"));
        paymentRepository.save(transaction);

        Transaction t = new Transaction();
        t.setId("util-2");
        t.setName("Maynilad");
        t.setAmount(new BigDecimal("1034.2"));
        paymentRepository.save(t);
    }
}
