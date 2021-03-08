package com.example.demo.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "FirstName")
    @NotNull
    @NotBlank
    String FirstName;

    @Column(name = "LastName")
    @NotNull
    @NotBlank
    String LastName;

    public Student(Long id, @NotBlank String firstName, @NotBlank String lastName) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
    }
}
