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

    private Double initialFund = 10000.66;

    @Override
    public void run(String... args) {

        Transaction transaction = new Transaction();
        transaction.setDescription("Meralco");

        Item item = new Item();
        item.setName("Meralco");
        item.setAmount(2000.0);

        transaction.setItem(item);
        initialFund-= item.getAmount();
        transaction.setRemainingFund(initialFund);
        paymentRepository.save(transaction);

        Transaction t = new Transaction();
        t.setDescription("Maynilad");

        Item i = new Item();
        i.setName("Meralco");
        i.setAmount(2000.0);

        t.setItem(i);
        initialFund-= i.getAmount();
        t.setRemainingFund(initialFund);
        paymentRepository.save(t);
    }
}
