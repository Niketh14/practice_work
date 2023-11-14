package com.jwt.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.Course;
import com.jwt.service.CourseService;

import java.util.List;

@RestController
public class CourseController
{

    private final CourseService courseService;

    public CourseController( @Autowired CourseService courseService )
    {
        this.courseService = courseService;
    }

    @CrossOrigin( "*" )
    @GetMapping( "/api/courses" )
    public List<Course> all()
    {
        return courseService.all();
    }
    


    @PostMapping( "/api/courses" )
    public Course save( @RequestBody Course course ){
        return null;
    }

    @DeleteMapping( "/api/courses/{courseId}" )
    public void delete( @PathVariable String courseId ){

    }
}
