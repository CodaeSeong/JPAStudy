package com.example.jpastudy.entity;


import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class humanAttributes implements Serializable {

    private String name;

    private int age;

    private String region;

    private String address;

    private String zipcode;

    private String homeNumber;
}
