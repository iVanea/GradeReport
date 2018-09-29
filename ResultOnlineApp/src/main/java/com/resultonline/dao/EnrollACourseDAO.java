package com.resultonline.dao;

import com.resultonline.model.EnrollACourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollACourseDAO {
// int idEnrollACourse, int year, int semester, int idStudent, int idCourse
    static Map<Integer,EnrollACourse> enrollACourseBd = new HashMap<>();
//    StudentDAO st;

    {
        for(int i = 1; i<10; i++) {
            enrollACourseBd.put(1000*i, new EnrollACourse(1000*i, 2018, 1, 100*i, 1, "jCharles"));
            enrollACourseBd.put(1001*i, new EnrollACourse(1001*i, 2018, 1, 101*i, 2, "aChelsea"));
            enrollACourseBd.put(1002*i, new EnrollACourse(1002*i, 2018, 1, 102*i, 3, "mWoods"));
            enrollACourseBd.put(1003*i, new EnrollACourse(1003*i, 2018, 2, 103*i, 1, "jCharles"));
            enrollACourseBd.put(1004*i, new EnrollACourse(1004*i, 2018, 2, 104*i, 2, "aChelsea"));
            enrollACourseBd.put(1005*i, new EnrollACourse(1005*i, 2018, 2, 105*i, 3, "mWoods"));
            enrollACourseBd.put(1006*i, new EnrollACourse(1006*i, 2018, 3, 106*i, 1, "jCharles"));
            enrollACourseBd.put(1007*i, new EnrollACourse(1007*i, 2018, 3, 107*i, 2, "aChelsea"));
            enrollACourseBd.put(1008*i, new EnrollACourse(1008*i, 2018, 3, 108*i, 3, "mWoods"));
            enrollACourseBd.put(1009*i, new EnrollACourse(1009*i, 2018, 4, 109*i, 2, "aChelsea"));
            enrollACourseBd.put(1010*i, new EnrollACourse(1010*i, 2018, 5, 110*i, 3, "mWoods"));
        }
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
        System.out.println("semester: "+semesterCurrent+", Year:"+yearCurrent+", ProfessorID:"+idProf);
        for (Map.Entry<Integer,EnrollACourse> e : enrollACourseBd.entrySet()){
            if(((e.getValue().getYear()==yearCurrent)
                    && (e.getValue().getSemester()==semesterCurrent) && (e.getValue().getIdProfessor().equals(idProf)))){
//                System.out.println(e.getValue().getIdStudent());
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
