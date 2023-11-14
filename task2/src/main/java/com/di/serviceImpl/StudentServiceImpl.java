package com.di.serviceImpl;

import org.springframework.stereotype.Service;

import com.di.model.Student;
import com.di.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final List<Student> students;

    public StudentServiceImpl() {
        this.students = new ArrayList<>();
        add(new Student("1", 0, "John Doe", null, 0));
        add(new Student("2", 0, "Jane Smith", null, 0));
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public List<Student> all() {
        return students;
    }

    @Override
    public Student findById(String id) {
        for (Student student : students) {
            String studentId = (String) student.getId();
            if (studentId != null && studentId.equals(id)) {
                return student;
            }
        }
        return null;
    }


    // Add a method to add test students inside the constructor
    private void addTestStudents() {
        add(new Student("3", 0, "Michael Johnson", null, 0));
        add(new Student("4", 0, "Emily Williams", null, 0));
    }
}
