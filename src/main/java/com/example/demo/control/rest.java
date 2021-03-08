package com.example.demo.control;

import com.example.demo.domain.Student;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    @PostMapping("/craete")
    public ResponseEntity<Student> create(
            @PathVariable("firstname") String firstname ,
            @PathVariable("lastname") String  lastname){
        log.debug("Craete Student ...");
        return new ResponseEntity<>(new Student(1L,firstname,lastname), HttpStatus.OK);
    }

}
