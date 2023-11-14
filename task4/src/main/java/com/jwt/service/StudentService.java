package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;

public interface StudentService {
    List<Student> all();

    Student save(Student student);

    void delete(String studentId);

	void enrollStudentInCourse(String studentId, String courseId);

	Student save1(Student student);

	StudentService save(StudentService student);
}