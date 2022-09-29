package com.payment.collection.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private String id;
    private String description;
}
