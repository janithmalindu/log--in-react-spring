package com.janith.studentreg.controller;

import com.janith.studentreg.model.Student;
import com.janith.studentreg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
       studentService.saveStudent(student);
        return "success";
    }
    @GetMapping("/getall")
    public List<Student> getAll() {
        return studentService.getAllStudent();
    }
}
