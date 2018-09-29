package com.resultonline.controller;

import com.resultonline.dao.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resultonline.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;


@WebServlet("/professor")
public class ProfessorController extends HttpServlet {


    private static final long serialVersionUID = 1L;

    private ProfessorDao professorDao;
    private EnrollACourseDAO enrollACourseDAO;
    private GradeReportDAO gradeReportDAO;
    private StudentDAO studentDAO;
    private CourseDAO courseDao;
    private CoursesSemesterDAO coursSemesterDao;
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        enrollACourseDAO = new EnrollACourseDAO();
        professorDao = new ProfessorDao();
        gradeReportDAO = new GradeReportDAO();
        studentDAO = new StudentDAO();
        courseDao = new CourseDAO();
        coursSemesterDao = new CoursesSemesterDAO();
    }

private void part1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String jsonSting = request.getParameter("gradeReport");
        GradeReport gradeReport = mapper.readValue(request.getParameter("gradeReport"), GradeReport.class);
        gradeReport.setIdGradeReport(gradeReportDAO.gradeReportId());
        gradeReportDAO.addGradeReport(gradeReport);


        PrintWriter out =response.getWriter();
        try{
            out.print(mapper.writeValueAsString(gradeReport));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }


}


public void part2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int yearCur=Integer.parseInt(request.getParameter("yearCurrent1"));
    int semCur=Integer.parseInt(request.getParameter("semCurrent"));
    int idStud=Integer.parseInt(request.getParameter("studCurrent"));
    int idC=Integer.parseInt(request.getParameter("idCurrent"));
    String idProf=request.getParameter("idProfCurrent");
    double grade= Double.parseDouble(request.getParameter("gradeCurrent"));
    request.setAttribute("gradeReports", gradeReportDAO.getAllStudentForCourse(yearCur,semCur,idStud,idC,idProf));
    RequestDispatcher requestDispatcher= request.getRequestDispatcher("WEB-INF/views/gradeReportProfessor.jsp");
    requestDispatcher.forward(request,response);
}



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int yearCurrent=Integer.parseInt(request.getParameter("yearCurrent"));
        int semesterCurrent=Integer.parseInt(request.getParameter("semesterCurrent"));

        String idProfessor=request.getParameter("idProfessor");
        List<Integer> enroledStudentsIds = enrollACourseDAO.getAllStudentEnrollACourse(yearCurrent,semesterCurrent,idProfessor);
//        System.out.println(Arrays.toString(enroledStudentsIds.toArray()));
        List<Student> students = studentDAO.getStudentsWithIds(enroledStudentsIds);



        Integer courseId = coursSemesterDao.getCourseIdByProfessorId(idProfessor);
        String courseName = courseDao.getCourseNameById(courseId);
//        System.out.println("Course Name: "+courseName);
        Professor prof = professorDao.getProfessorById(idProfessor);

        request.setAttribute("selectedCourse", courseId);
        request.setAttribute("selectedSemester", semesterCurrent);
        request.setAttribute("professorId", idProfessor);
        request.setAttribute("selectedYear",yearCurrent );
        request.setAttribute("professorFullName", prof.getFirstNameProfessor()+" "+prof.getLastNameProfessor());
        request.setAttribute("students", students);
//        request.setAttribute("studentList", mapper.writeValueAsString(students));
        request.setAttribute("courseName", courseName);

        RequestDispatcher requestDispatcher= request.getRequestDispatcher("WEB-INF/views/gradeReportProfessor.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Professor prof = professorDao.getProfessorById("jCharles");
        String courseName = courseDao.getCourseNameById(coursSemesterDao.getCourseIdByProfessorId("jCharles"));
        System.out.println("Course Name: "+courseName);
        request.setAttribute("courseName", courseName);

        request.setAttribute("professorName", prof.getFirstNameProfessor()+" "+prof.getLastNameProfessor());
        request.getRequestDispatcher("WEB-INF/views/professor.jsp").forward(request,response);

    }

}
