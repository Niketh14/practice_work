package com.di.serviceImpl;

import org.springframework.stereotype.Service;

import com.di.model.Student;
import com.di.service.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentServiceImplMap implements StudentService {

    private final Map<String, Student> studentMap;

    public StudentServiceImplMap() {
        this.studentMap = new HashMap<>();
        // Add test students to the map
        add(new Student("1", 0, "John Doe", null, 0));
        add(new Student("2", 0, "Jane Smith", null, 0));
    }

    @Override
    public void add(Student student) {
        studentMap.put((String) student.getId(), student);
    }

    @Override
    public void delete(Student student) {
        studentMap.remove(student.getId());
    }

    @Override
    public List<Student> all() {
        return studentMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }
}

