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




    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">

    <script type="text/javascript" charset="utf8" src=" https://code.jquery.com/jquery-3.3.1.js"></script>
    <script type="text/javascript" charset="utf8" src=" https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>


</head>
<body>

<main>
    <div id="firstPart">

           <table id="tabCourse">
            <thead>
            <tr>
                <th>Id CoursesSemester</th>
                <th>Year</th>
                <th>Semester</th>
                <th>Id Course</th>
                <th>Id Professor</th>
                <th>Id Student</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${coursesSemester}" var="courseSemester">

                <tr id="${courseSemester.idCourse}">

                    <td> <c:out value="${courseSemester.idCoursesSemester}"></c:out> </td>
                    <td> <c:out value="${courseSemester.year}"></c:out> </td>
                    <td > <c:out value="${courseSemester.semester}"></c:out> </td>
                    <td  > <c:out value="${courseSemester.idCourse}"></c:out> </td>
                    <td  > <c:out value="${courseSemester.idProfessor}"></c:out> </td>

                    <td>
                      000

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
                <th>Year </th>
                <th>Semestre </th>
                <th>ID Student</th>
                <th>ID Course</th>
                <th>ID Professor</th>
                <
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${enrollACourses}" var="enrollACourse">
                <tr>
                    <td><c:out value="${enrollACourse.idEnrollACourse}" /></td>
                    <td><c:out value="${enrollACourse.year}" /></td>
                    <td><c:out value="${enrollACourse.semester}" /></td>
                    <td><c:out value="${enrollACourse.idStudent}" /></td>
                    <td><c:out value="${enrollACourse.idCourse}" /></td>
                    <td><c:out value="${enrollACourse.idProfessor}" /></td>
                </tr>
            </c:forEach>

            </tbody>

        </table>
    </div>

</main>

</body>
</html>
