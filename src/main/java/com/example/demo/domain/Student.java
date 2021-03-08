package com.example.demo.domain;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "student")
public class Student {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    Long id;

    public Student(Long id, @NotBlank String email, @NotBlank String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    @UniqueElements
    @Column(name = "email")
    @NotNull
    @NotBlank
    String email;

    @Column(name = "password")
    @NotNull
    @NotBlank
    String password;


}
