package com.code.service;

import com.code.model.Student;

public interface StudentService {

    Student getById(int id);

    Student getByName(String name);

    Student save(Student student);
}
