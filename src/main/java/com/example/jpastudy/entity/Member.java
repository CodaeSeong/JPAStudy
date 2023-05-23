package com.example.jpastudy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    private String name;

    private String phone;

    private String address;

    private String zipCode;


}
