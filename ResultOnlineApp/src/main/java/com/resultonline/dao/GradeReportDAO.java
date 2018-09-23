package com.resultonline.dao;
import com.resultonline.model.EnrollACourse;
import com.resultonline.model.GradeReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeReportDAO {
    Map<Integer,GradeReport>  gradeReportBd = new HashMap<>();

    private EnrollACourseDAO enrollACourseDAO ;
    List<EnrollACourse> list = new ArrayList<>();
    public List<EnrollACourse> getAllStudentForCourse(int year, int semester, int idStudent, int idCourse, String idProfessor){
            for(Map.Entry<Integer,EnrollACourse> e :   enrollACourseDAO.enrollACourseBd.entrySet()){

            if((e.getValue().getYear()==year)&&(e.getValue().getSemester()==semester) && (e.getValue().getIdStudent()==idStudent)
                    && (e.getValue().getIdCourse()==idCourse) && (e.getValue().getIdProfessor()==idProfessor)){
                  list.add(e.getValue());
            }

        }

       return list;
    }


    public void addGradeReport( GradeReport gradeReport){
       gradeReportBd.put(gradeReport.getIdGradeReport(),gradeReport);
    }


    public int gradeReportId() {
        return gradeReportBd.size()+1;
    }

    public List<GradeReport> getStudentReport(int idStudent){
        List<GradeReport> list = new ArrayList<>();

        for (Map.Entry<Integer,GradeReport> e : gradeReportBd.entrySet()){
            if(e.getValue().getIdStudent()==idStudent){
                list.add(e.getValue());
            }

        }

        return list;
    }

}
