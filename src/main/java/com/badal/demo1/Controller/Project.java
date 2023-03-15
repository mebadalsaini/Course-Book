package com.badal.demo1.Controller;

import com.badal.demo1.Service.CourseService;
import com.badal.demo1.Service.CourseServiceImpl;
import com.badal.demo1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Project {
   // @Autowired
   CourseServiceImpl courseService = new CourseServiceImpl();

    @GetMapping ("/hello")
    public String message(){
        return "<h1><i>Your first spring-boot application is successful.</i></h1>";
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){


        return courseService.getCourses();
    }
}