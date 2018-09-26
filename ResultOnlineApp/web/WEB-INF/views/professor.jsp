<%--
  Created by IntelliJ IDEA.
  User: jeanc
  Date: 9/23/2018
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Professor Workspace</title>
    <style>
        <%@include file="/resources/css/professor-style.css"%>
    </style>
</head>
<body>

<h2>Select semester</h2>
<form action="professor" method="post" >

    <input type="number" name="yearCurrent" id="currentYear" placeholder="Year"/> <br/>
    <input type="number" name="semesterCurrent" id="currentSemester" placeholder="Semester"/> <br/>
    <input type="text" name="idProfessor" id="professorId" placeholder="Professor Id"/> <br/>
    <input type="submit" id="submit" text="Select"/> <br/>
</form>


</body>
</html>
