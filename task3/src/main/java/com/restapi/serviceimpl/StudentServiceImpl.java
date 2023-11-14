package com.restapi.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.Student;
import com.restapi.repository.StudentRepository;
import com.restapi.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        // Implement as needed
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        // Implement as needed
        return null;
    }

    @Override
    public void saveStudent(Student student) {
        // Implement as needed
    }

    @Override
    public void updateStudent(Student student) {
        // Implement as needed
    }

    @Override
    public void deleteStudent(int id) {
        // Implement as needed
    }

    @Override
    public List<Student> getStudentsByNameStartsWith(String namePrefix) {
        // Implement logic to get students by name prefix from the repository
        // For example:
        // return studentRepository.findByNameStartingWith(namePrefix);
        return null;
    }
}

