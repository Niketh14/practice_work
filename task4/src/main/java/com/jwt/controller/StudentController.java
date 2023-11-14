package com.jwt.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jwt.model.Student;
import com.jwt.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentController implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    @CrossOrigin( "*" )
    @GetMapping( "/api/student" )
    public List<Student> all() {
        return students;
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public void delete(String studentId) {
        students.removeIf(student -> student.getId().equals(studentId));
    }

    @Override
    @PostMapping("/{studentId}/enroll/{courseId}")
    public void enrollStudentInCourse(String studentId, String courseId) {
        // Implement logic to enroll a student in a course
        // You may need to interact with a CourseService or modify the Student class to hold enrolled courses
    }

	@Override
	public StudentService save(StudentService student) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Student save1(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}

