package com.code.controller;

import com.code.model.Student;
import com.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/id")
    public ResponseEntity<?> getById(@RequestParam(value = "id", defaultValue = "1") int id){
        return ResponseEntity.ok(studentService.getById(id));
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ResponseEntity<?> getByName(@RequestParam(value = "name", defaultValue = "Ahmed") String name){
        return ResponseEntity.ok(studentService.getByName(name));

    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody(required = true) Student student){
        return ResponseEntity.ok(studentService.save(student));
    }

}
