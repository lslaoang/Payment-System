package com.payment.collection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    private String id;
    private Date date;

    Customer customer;

    @OneToMany
    List<Item> itemList;
}
