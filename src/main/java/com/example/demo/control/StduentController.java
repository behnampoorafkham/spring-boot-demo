package com.example.demo.control;

import com.example.demo.domain.Student;
import com.example.demo.service.interfaces.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.Random;


@Validated
@RestController
@RequestMapping
@Slf4j
@AllArgsConstructor
public class StduentController {
    private Logger log;
    @Autowired
    private StudentService studentService;

    @DeleteMapping("delete/{id}")
    public void update(@PathVariable("id") Long id) {
        studentService.delete(id);
    }


    @DeleteMapping("delete/all")
    public void delete() {
        studentService.deleteall();
    }

    @PutMapping("update/firstname/{id}")
    public void updateFirstName(@PathVariable("firstname") String firstname, @PathVariable("id") Long id) {
        studentService.updatefirstname(id, firstname);
    }


    @PutMapping("update/lastname/{id}")
    public void updateLastName(@PathVariable("lastname") String firstname, @PathVariable("id") Long id) {
        studentService.updatefirstname(id, firstname);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Optional<Student>> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<Optional<Student>>(studentService.find(id), HttpStatus.OK);
    }

    @GetMapping("find/all")
    public ResponseEntity<List<Student>> findById() {
        return new ResponseEntity<List<Student>>(studentService.findAll(), HttpStatus.OK);
    }

}
