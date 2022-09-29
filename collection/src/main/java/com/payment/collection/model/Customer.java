package com.payment.collection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Customer {

    private String id;
    private String name;
    @OneToMany
    List<Transaction> transactionList;
}
