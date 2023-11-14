package com.jwt.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jwt.model.Course;
import com.jwt.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    private final List<Student> students = new ArrayList<>();
    private final CourseService courseService; // Inject CourseService

    @Autowired
    public StudentServiceImpl(CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
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
    public void enrollStudentInCourse(@PathVariable String studentId, @PathVariable String courseId) {
        // Assuming your CourseService has a method to get a course by its ID
        Course course = courseService.getCourseById(courseId);

        // Assuming your Student class has a method to add an enrolled course
        Student student = getStudentById(studentId);
        student.enrollInCourse(course);
    }

    // You need to implement the logic to get a student by ID; this is just a placeholder method
    private Student getStudentById(String studentId) {
        return students.stream()
                .filter(student -> student.getId().equals(studentId))
                .findFirst()
                .orElse(null);
    }

	@Override
	public Student save1(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentService save(StudentService student) {
		// TODO Auto-generated method stub
		return null;
	}
}
