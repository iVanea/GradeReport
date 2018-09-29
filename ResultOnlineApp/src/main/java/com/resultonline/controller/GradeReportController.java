package com.resultonline.controller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resultonline.dao.*;
import com.resultonline.model.GradeReport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/gradeReport")
public class GradeReportController extends HttpServlet {

    GradeReportDAO gradeReportDAO;

    ObjectMapper mapper = new ObjectMapper();
    @Override
    public void init() throws ServletException {

        gradeReportDAO = new GradeReportDAO();

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Dopost.......");
        //courseId:courseId, studentId:studentId, year:year, semester:semester,prof:prof,letter:letter

        String jsonSting = request.getParameter("gradeReport");
        System.out.println(jsonSting);

        GradeReport gr = mapper.readValue(request.getParameter("gradeReport"), GradeReport.class);
        System.out.println(gr.getGrade());
        gr.setIdGradeReport(gradeReportDAO.gradeReportId() + 1);
        gradeReportDAO.addGradeReport(gr);
        PrintWriter out =response.getWriter();
        try{
            out.print(mapper.writeValueAsString(gr));
            System.out.println(mapper.writeValueAsString(gr));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("DoGET");
        //courseId:courseId, studentId:studentId, year:year, semester:semester,prof:prof,letter:letter

        int year=Integer.parseInt(request.getParameter("year"));
        int semesterCurrent=Integer.parseInt(request.getParameter("semester"));
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int courseId= Integer.parseInt(request.getParameter("courseId"));
        String professorId= request.getParameter("professorId");
        String grade = request.getParameter("letter");
        double gradeProcent = Double.parseDouble(request.getParameter("currentGrade"));
        System.out.println(""+year+" "+semesterCurrent+" "+studentId+" "+grade);

    }
}
