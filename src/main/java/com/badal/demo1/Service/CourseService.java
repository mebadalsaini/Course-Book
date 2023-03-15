package com.badal.demo1.Service;

import com.badal.demo1.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    public List<Course> getCourses();
}
