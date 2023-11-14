package com.restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.restapi.entity.Student;
import com.restapi.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentsController {

    private final StudentService studentService;

    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> all() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PutMapping
    public void update(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    // New endpoint to find students by name prefix
    @GetMapping("/byName")
    public List<Student> findByNameStartsWith(@RequestParam String namePrefix) {
        return studentService.getStudentsByNameStartsWith(namePrefix);
    }
}
