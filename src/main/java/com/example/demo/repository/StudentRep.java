package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRep extends JpaRepository<Student,Long> {

    @Query("update Student s set s.password = :password WHERE s.id = :studentId")
    public void updatePassword(Long id , String password);

    @Query("update Student s set s.email = :email WHERE s.id = :studentId")
    public void updateEmail(Long id , String email);

    public Optional<Student> findByEmail(String email);

}
