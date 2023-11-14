package com.di.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.di.model.Student;
import com.di.service.StudentService;

@RestController
public class StudentController
{
	

	 private final StudentService studentService;

	    public StudentController(@Qualifier("studentServiceImpl") StudentService studentService) {
	        this.studentService = studentService;
	    }
   /* private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }*/

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
        return studentService.findById( id );
    }

}
