package com.janith.studentreg.service;

import com.janith.studentreg.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    public Student saveStudent(Student student);


    List<Student> getAllStudent();
}
