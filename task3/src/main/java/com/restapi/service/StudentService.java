package com.restapi.service;




import java.util.List;

import com.restapi.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);

    // New method to get students by name prefix
    List<Student> getStudentsByNameStartsWith(String namePrefix);
}




