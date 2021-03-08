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
import java.util.Random;

@Validated
@RestController
@RequestMapping
@Slf4j
@AllArgsConstructor
public class LoginController {
    private Logger log;
    @Autowired
    private StudentService studentService;


    @PostMapping("/singup}")
    public ResponseEntity<Student> create(
            @Valid @RequestBody String email,
            @RequestBody String password) {
        log.debug("Chaeck exist ...");
        if (studentService.findByEmail(email)==null){
            throw new RuntimeException("The Student exist with this email");
        }
        log.debug("Create ...");
        Long id = new Random().nextLong();
        log.debug("Your id is {}", id);
        Student s1 = new Student(id, email, password);
        log.debug("the Student Create!!");
        return new ResponseEntity<>(studentService.save(s1)
                , HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(
            @RequestBody String email,
            @RequestBody String password
    ) throws Exception {
        if(studentService.findByEmail(email).isEmpty()){
            throw new Exception("Not exist");
        }else
            return new ResponseEntity<>(true , HttpStatus.OK);
    }

}
