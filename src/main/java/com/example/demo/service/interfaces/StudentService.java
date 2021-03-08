package com.example.demo.service.interfaces;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    public Student save(Student student);
    public void delete(Long id);
    public void updatefirstname(Long id , String firstname);
    public void updatelastname(Long id , String lastnamename);
    public void deleteall();
    public List<Student> findAll();
    public Optional<Student> find(Long id);
    public Optional<Student> findByEmail(String email);
    }
