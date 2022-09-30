package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private Double amount;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "item_id")
    private Item item;


}
