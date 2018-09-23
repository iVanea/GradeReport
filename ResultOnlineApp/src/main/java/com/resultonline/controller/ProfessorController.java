package com.resultonline.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resultonline.dao.EnrollACourseDAO;
import com.resultonline.dao.GradeReportDAO;
import com.resultonline.dao.ProfessorDao;
import com.resultonline.model.GradeReport;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/professor")
public class ProfessorController extends HttpServlet {


    private static final long serialVersionUID = 1L;

    private ProfessorDao professorDao;
    private EnrollACourseDAO enrollACourseDAO;
    private GradeReportDAO gradeReportDAO;
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        enrollACourseDAO = new EnrollACourseDAO();
       professorDao = new ProfessorDao();
        gradeReportDAO = new GradeReportDAO();
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
        List<Integer> students = enrollACourseDAO.getAllStudentEnrollACourse(yearCurrent,semesterCurrent,idProfessor);
        request.setAttribute("students", students);
        request.setAttribute("studentList", mapper.writeValueAsString(students));
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("WEB-INF/views/gradeReportProfessor.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/professor.jsp").forward(request,response);
    }

}
