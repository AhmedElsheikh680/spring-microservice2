package com.code.service.impl;

import com.code.model.Student;
import com.code.repo.StudentRepo;
import com.code.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student getById(int id) {
//        Student student = new Student();
//        student.setId(id);
//        student.setName("Name: "+ id);
//        student.setMobileNo("123456");
//        return student;
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public Student getByName(String name) {
//        Student student = new Student();
//        student.setId(2);
//        student.setName(name);
//        student.setMobileNo("741852");
//        return student;
        return studentRepo.findByName(name);
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
//        System.out.println(
//                "ID: "+student.getId()+ " Name: "+ student.getName()+ " Mobile NO: "+ student.getMobileNo()
//        );
//        return student;
    }
}
