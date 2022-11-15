package com.code.service.impl;

import com.code.entity.Course;
import com.code.repository.CourseRepo;
import com.code.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;


    @Override
    public List<Course> courses() {
        return courseRepo.findAll();
    }

    @Override
    public Course course(int id) {
        return courseRepo.findById(id).orElse(null);
    }

    @Override
    public Course create(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course update(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public boolean delete(int id) {
         courseRepo.deleteById(id);
         return true;
    }
}
