package com.payment.collection.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "item")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, insertable = false, updatable = false)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Long id;
    private String name;
    private Double amount;

}
