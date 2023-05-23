package com.example.jpastudy.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String address;

    private String zipCode;
}
