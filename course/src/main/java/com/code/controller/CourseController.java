package com.code.controller;

import com.code.entity.Course;
import com.code.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("")
    public ResponseEntity<?> courses(){
        return ResponseEntity.ok(courseService.courses());
    }

    @GetMapping("/id")
    public ResponseEntity<?> course(@RequestParam int id){
        return ResponseEntity.ok(courseService.course(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody Course course){
        return ResponseEntity.ok(courseService.create(course));
    }

    @PutMapping("")
    public ResponseEntity<?> update(@RequestBody Course course){
        return ResponseEntity.ok(courseService.update(course));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        return ResponseEntity.ok(courseService.delete(id));
    }
}
