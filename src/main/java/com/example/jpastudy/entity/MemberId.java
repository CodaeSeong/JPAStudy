package com.example.jpastudy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class MemberId implements Serializable {

    @Column(name="member_id")
    private Long id;

    @Column(name="member_id2")
    private Long id2;

}
