package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRep;

import java.util.List;
import java.util.Optional;

public class StudentServiceImp {
    private StudentRep studentRep;

    public Student save(Student student){
        return studentRep.save(student);
    }

    public void delete(Long id){
         studentRep.deleteById(id);
    }

    public void updatefirstname(Long id , String firstname){
        studentRep.updatefirstname(id,firstname);
    }

    public void updatelastname(Long id , String lastnamename){
        studentRep.updatefirstname(id,lastnamename);
    }

    public void deleteall(){
        studentRep.deleteAll();
    }

    public List<Student> findAll(){
        return studentRep.findAll();
    }

    public Optional<Student> find(Long id){
        return studentRep.findById(id);
    }

}
