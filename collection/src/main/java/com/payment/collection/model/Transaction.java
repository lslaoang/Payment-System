package com.payment.collection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    private String id;
    private String name;
    private BigDecimal amount;

}
