package com.example.demo.service.src;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRep;
import com.example.demo.service.interfaces.StudentService;

import java.util.List;
import java.util.Optional;

public class StudentServiceImp implements StudentService {
    private StudentRep studentRep;

    public Student save(Student student) {
        return studentRep.save(student);
    }

    public void delete(Long id) {
        studentRep.deleteById(id);
    }

    public void updatefirstname(Long id, String email) {
        studentRep.updateEmail(id, email);
    }

    public void updatelastname(Long id, String password) {
        studentRep.updatePassword(id, password);
    }

    public void deleteall() {
        studentRep.deleteAll();
    }

    public List<Student> findAll() {
        return studentRep.findAll();
    }

    public Optional<Student> find(Long id) {
        return studentRep.findById(id);
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return studentRep.findByEmail(email);
    }

}
