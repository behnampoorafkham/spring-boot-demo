package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRep extends JpaRepository<Student,Long> {

    @Query("update Student s set s.firstname = :firstname WHERE s.id = :studentId")
    public void updatefirstname(Long id , String firstname);

    @Query("update Student s set s.lastname = :lastname WHERE s.id = :studentId")
    public void updatelastname(Long id , String firstname);

}
