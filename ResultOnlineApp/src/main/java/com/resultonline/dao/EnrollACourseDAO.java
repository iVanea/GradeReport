package com.resultonline.dao;

import com.resultonline.model.EnrollACourse;
import com.resultonline.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollACourseDAO {
// int idEnrollACourse, int year, int semester, int idStudent, int idCourse
    static Map<Integer,EnrollACourse> enrollACourseBd = new HashMap<>();
//    StudentDAO st;

    {
        enrollACourseBd.put(1000, new EnrollACourse(1000, 2018,1,100,1,"jean1"));
        enrollACourseBd.put(1001, new EnrollACourse(1001, 2018,1,101,2,"jean2"));
        enrollACourseBd.put(1002, new EnrollACourse(1002, 2018,1,103,2,"jean2"));

    }


    public boolean numberCourse(int idStud, int yearCurrent, int semesterCurrent ){
       int count =0;

        for (Map.Entry<Integer,EnrollACourse> e : enrollACourseBd.entrySet()){
            if((e.getValue().getIdStudent()==idStud) && (e.getValue().getYear()==yearCurrent) && (e.getValue().getSemester()==semesterCurrent)){
               count++;
            }
        }

        if(count>=4){

            return true;
        }


        return false;
    }



    public List<Integer> getAllStudentEnrollACourse(int yearCurrent, int semesterCurrent,String idProf){
        List<Integer> list=new ArrayList<>();

        for (Map.Entry<Integer,EnrollACourse> e : enrollACourseBd.entrySet()){
            if(((e.getValue().getYear()==yearCurrent)
                    && (e.getValue().getSemester()==semesterCurrent) && (e.getValue().getIdProfessor().equals(idProf)))){
                System.out.println(e.getValue().getIdStudent());
                list.add(e.getValue().getIdStudent());

               /* for(Map.Entry<Integer,Student> stud :   StudentDAO.studentsBd.entrySet()){
                    System.out.println(stud.getValue().getIdStudent()+"test"+ e.getValue());
                    if(stud.getValue().getIdStudent()==e.getValue().getIdStudent()){
                        System.out.println(stud.getValue());
                        list.add(stud.getValue());
                    }
                }*/

                }
        }

        return list;
    }


    public int enrollACourseId() {
        return enrollACourseBd.size()+1;
    }

    public void addEnrollACourse(EnrollACourse EnrollACourse){

        enrollACourseBd.put(EnrollACourse.getIdCourse(),EnrollACourse);
    }

    public void deleteEnrollACourse(int EnrollACourseId){
        enrollACourseBd.remove(EnrollACourseId);
    }

    public void updateEnrollACourse(EnrollACourse EnrollACourse){
        enrollACourseBd.put(EnrollACourse.getIdCourse(),EnrollACourse);
    }


    public List<EnrollACourse> getAllEnrollACourse(){
        List<EnrollACourse> list =new ArrayList<>(enrollACourseBd.values());
        list.sort((EnrollACourse o1, EnrollACourse o2)->o1.getYear()  - o2.getYear());
        return list;
    }







}
