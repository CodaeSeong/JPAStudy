package com.example.jpastudy.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@SequenceGenerator(
        name = "member_seq",
        sequenceName = "member_seq",
        initialValue = 1,
        allocationSize = 1
)
@Getter
@Setter
public class Member {

    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    private Long id;

    @Embedded
    private humanAttributes humanAttributes;


}
