package com.payment.collection.bootstrap;

import com.payment.collection.model.Item;
import com.payment.collection.model.Transaction;
import com.payment.collection.repo.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    public InitData(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) {
        Transaction transaction = new Transaction();
        transaction.setName("Meralco");

        Item item = new Item();
        item.setName("Meralco");
        item.setFundAllocated(2000.0);

        transaction.setItem(item);
        transaction.setAmount(1000.2);
        paymentRepository.save(transaction);

        Transaction t = new Transaction();
        t.setName("Maynilad");

        Item i = new Item();
        i.setName("Meralco");
        i.setFundAllocated(2000.0);

        t.setItem(i);
        t.setAmount(1034.2);
        paymentRepository.save(t);
    }
}
