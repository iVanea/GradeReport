package com.resultonline.dao;

import com.resultonline.model.CoursesSemester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoursesSemesterDAO {

    Map<Integer,CoursesSemester> coursesSemesterBd = new HashMap<>();

    {
        coursesSemesterBd.put(1,new CoursesSemester(1, 2018, 1,1,"jean1") );
        coursesSemesterBd.put(2,new CoursesSemester(2, 2018, 1,2,"jean2") );
        coursesSemesterBd.put(3,new CoursesSemester(3, 2018, 1,3,"ion3") );
       /* coursesSemesterBd.put(4,new CoursesSemester(4, 2018, 1,4) );
        coursesSemesterBd.put(5,new CoursesSemester(3, 2018, 1,5) );
        coursesSemesterBd.put(6,new CoursesSemester(6, 2018, 1,6) );
        coursesSemesterBd.put(7,new CoursesSemester(7, 2018, 1,7) );
        coursesSemesterBd.put(8,new CoursesSemester(8, 2018, 2,8) );
        coursesSemesterBd.put(9,new CoursesSemester(9, 2018, 2,9) );
        coursesSemesterBd.put(10,new CoursesSemester(10, 2018, 2,10) );
        coursesSemesterBd.put(11,new CoursesSemester(11, 2018, 2,11) );
        coursesSemesterBd.put(12,new CoursesSemester(12, 2018, 2,12) );
*/
    }









    public void addCoursesSemester(CoursesSemester coursesSemester){

        coursesSemesterBd.put(coursesSemester.getidCoursesSemester(),coursesSemester);
    }

    public void deleteCoursesSemester(int idCoursesSemester){
        coursesSemesterBd.remove(idCoursesSemester);
    }

    public void updateCoursesSemester(CoursesSemester coursesSemester){
        coursesSemesterBd.put(coursesSemester.getidCoursesSemester(),coursesSemester);
    }



    public List<CoursesSemester> getAllCoursesSemester(){
        ArrayList<CoursesSemester> list=new ArrayList<>(coursesSemesterBd.values());
        list.sort((CoursesSemester o1, CoursesSemester o2)->o1.getYear()  - o2.getYear());
        return list;
    }

    public CoursesSemester getCoursesSemesterById(int idCoursesSemester){
        return coursesSemesterBd.get(idCoursesSemester);
    }









}
