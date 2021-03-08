package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "FirstName")
    String FirstName;

    @Column(name = "LastName")
    String LastName;

}
