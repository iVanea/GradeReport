package com.resultonline.controller;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.resultonline.dao.CourseDAO;
import com.resultonline.dao.EnrollACourseDAO;
import com.resultonline.model.Courses;
import com.resultonline.model.EnrollACourse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/enroll")
public class CourseController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CourseDAO courseDAO;
    private EnrollACourseDAO enrollACourseDAO;
    ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        courseDAO = new CourseDAO();
        enrollACourseDAO = new EnrollACourseDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /* request.setAttribute("courses",courseDAO.getAllCourses());
        request.setAttribute("enrollACourses",enrollACourseDAO.getAllEnrollACourse());
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("WEB-INF/views/enroll.jsp");
        requestDispatcher.forward(request,response);*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     /*   ArrayList<Book> shoppingCar = new ArrayList<Book>();
        request.setAttribute("b", shoppingCar);*/

       /*String jSonString = req.getParameter("enrollACourse");
        EnrollACourse enrollACourse = mapper.readValue(req.getParameter("enrollACourse"),EnrollACourse.class);
        enrollACourse.setIdEnrollACourse(enrollACourseDAO.enrollACourseId());
        enrollACourseDAO.addEnrollACourse(enrollACourse);
        PrintWriter out =resp.getWriter();
        try{
            out.print(mapper.writeValueAsString(enrollACourse));
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        }*/

    }
}
