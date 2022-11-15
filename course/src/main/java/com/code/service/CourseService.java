package com.code.service;

import com.code.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> courses();
    Course course(int id);
    Course create(Course course);
    Course update(Course course);
    boolean delete(int id);
}
