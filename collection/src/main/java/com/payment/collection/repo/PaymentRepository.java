package com.payment.collection.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PaymentRepository extends CrudRepository<Long, String> {

}
