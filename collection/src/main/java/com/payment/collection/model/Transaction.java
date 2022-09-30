package com.payment.collection.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Long id;
    private String description;
    private Double remainingFund;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "item_id")
    private Item item;


}
