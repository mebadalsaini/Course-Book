package com.badal.demo1.Service;

import com.badal.demo1.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;
    public CourseServiceImpl(){
        List<Course> list = new ArrayList<>();
        list.add(new Course(101, "Roadside Stand", "Written by Robert Frost"));
        list.add(new Course(102, "Think like a monk", "Written by Jay Shetty"));
        list.add(new Course(103, "3 Mistakes of my life", "Written by Chetan Bhagat"));
    }
    @Override
    public List<Course> getCourses() {
        List<Course> list = new ArrayList<>();
        list.add(new Course(101, "Roadside Stand", "Written by Robert Frost"));
        list.add(new Course(102, "Think like a monk", "Written by Jay Shetty"));
        list.add(new Course(103, "3 Mistakes of my life", "Written by Chetan Bhagat"));
        return list;
    }
}

