package com.example.jpastudy.entity;

import jakarta.persistence.*;

@Entity
@SequenceGenerator(
        name="customer_seq",
        sequenceName = "customer_seq",
        initialValue = 1,
        allocationSize = 1
        )
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private int id;


    @Embedded
    private humanAttributes humanAttributes;




}
