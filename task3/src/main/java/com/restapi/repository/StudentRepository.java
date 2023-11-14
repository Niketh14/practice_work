package com.restapi.repository;



import org.springframework.data.repository.CrudRepository;

import com.restapi.entity.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    // Method signature for finding students by name prefix
    List<Student> findByNameStartingWith(String namePrefix);
}
