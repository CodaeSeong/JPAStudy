package com.example.jpastudy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member2 {

    @Id
    @Column(name = "member_id")
    private String id;

    private String name;

    private String phone;

    @Embedded
    private Address address;



}
