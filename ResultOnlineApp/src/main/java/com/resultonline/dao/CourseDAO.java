package com.resultonline.dao;

import com.resultonline.model.Courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseDAO {


    Map<Integer,Courses> CourseBd = new HashMap<>();

    {
        CourseBd.put(1, new Courses(1,"Parallel Programming"));
        CourseBd.put(2, new Courses(2,"Algorithms"));
        CourseBd.put(3, new Courses(3,"Networks"));
        CourseBd.put(4, new Courses(4,"Advanced Software Development"));
        CourseBd.put(5, new Courses(5,"Enterprise Architecture"));
        CourseBd.put(6, new Courses(6,"Big Data"));
        CourseBd.put(7, new Courses(7,"Web Application Architecture"));
        CourseBd.put(8, new Courses(8,"Database Management Systems"));
        CourseBd.put(9, new Courses(9,"Web Programming"));
        CourseBd.put(10, new Courses(10,"Modern Programming Practices"));


    }

    public int courseId() {
        return CourseBd.size()+1;
    }

    public void addCourse(Courses Courses){

        CourseBd.put(Courses.getIdCourse(),Courses);
    }

    public void deleteCourses(int CoursesId){
        CourseBd.remove(CoursesId);
    }

    public void updateCourses(Courses Courses){
        CourseBd.put(Courses.getIdCourse(),Courses);
    }


    public List<Courses> getAllCourses(){
        return new ArrayList<>(CourseBd.values());
    }

    public Courses getCoursesById(int CoursesId){
        return CourseBd.get(CoursesId);
    }

    public String getCourseNameById(int id){
        return CourseBd.get(id).getNameCourse();
    }



}
