<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Enroll course</title>

    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


    <script>
        <%@include file="../../resources/js/myScript.js"%>
    </script>
    <script>
        <%@include file="../../resources/js/script_test.js"%>
    </script>
    <style>
        <%@include file="../../resources/css/style.css"%>
    </style>



</head>
<body>

<main>
<div id="firstPart">
   <table>
       <thead>
        <tr>
            <th>ID Student</th>
             <th>ID Course</th>
           <th>Name Course</th>
            <th>Enroll a course Course</th>
       </tr>
       </thead>
       <tbody>
       <c:forEach items="${courses}" var="course">

           <tr id="${course.idCourse}">
               <td><input type="text"  class="classInput" ></td>
               <td><input type="text"  class="id_course"    c:out value="${course.idCourse}" />          </td>
               <td ><c:out value="${course.nameCourse}" /></td>
               <td><input class="bttest" id="${course.idCourse}" type="button" name="enroll" value="Confirm">
                   <input type="hidden" id="Task${course.idCourse}" value="${course.idCourse}" />
               </td>

           </tr>
       </c:forEach>

       </tbody>

   </table>
</div>

<div id="secondPart">



    <table id="tb_enrollCourses">

      <thead>
      <tr>
          <th>ID EnrollACourse</th>
          <th>ID Student</th>
          <th>ID Course</th>
          <th>Block </th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${enrollACourses}" var="enrollACourse">
          <tr>
              <td><c:out value="${enrollACourse.idEnrollACourse}" /></td>
              <td><c:out value="${enrollACourse.idStudent}" /></td>
              <td><c:out value="${enrollACourse.idCourse}" /></td>
              <td><c:out value="${enrollACourse.block}" /></td>

          </tr>
      </c:forEach>

      </tbody>

  </table>
</div>

</main>

</body>
</html>
