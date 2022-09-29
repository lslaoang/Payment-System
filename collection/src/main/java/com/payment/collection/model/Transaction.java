package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    private String id;
    private Date date;

    private Customer customer;

    @OneToMany
    List<Item> itemList;
}
