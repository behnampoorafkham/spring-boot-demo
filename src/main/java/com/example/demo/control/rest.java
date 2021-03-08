package com.example.demo.control;

import com.example.demo.domain.Student;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RestController
@RequestMapping
@Slf4j
@AllArgsConstructor
public class rest {
    private Logger log;
    @PostMapping("/craete/{firstname}/{lastname}")
    public ResponseEntity<Student> create(
            @PathVariable("firstname") String firstname ,
            @PathVariable("lastname") String  lastname){
        log.debug("Creating ...");
        Student s1 = new Student();
        return new ResponseEntity<>(s1, HttpStatus.OK);
    }

}
