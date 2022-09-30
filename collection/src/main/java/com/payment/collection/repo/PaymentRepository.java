package com.payment.collection.repo;

import com.payment.collection.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PaymentRepository extends JpaRepository<Transaction, String> {
}
