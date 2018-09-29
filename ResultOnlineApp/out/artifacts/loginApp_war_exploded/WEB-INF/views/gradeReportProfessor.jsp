<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Grade Report</title>
    <link href="/resources/css/gradeReport.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="/resources/js/gradeScript.js"></script>

</head>
<body>

<header>
    <div class="barCourse">
        <h3>Course ${courseName}</h3>
        <p>Good afternoon professor ${professorFullName}!</p>
        <button id="logout" name="logoutBtn">Logout</button>
    </div>
</header>
<div id="content">
<div id="tableStudents">

    <table id="tabStudent">
        <thead>
        <caption>Students</caption>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surename</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student">

            <tr id="${student.idStudent}">
                <td> <c:out value="${student.idStudent}"/> </td>
                <td><c:out value="${student.firstNameStudent}"/></td>
                <td><c:out value="${student.lastNameStudent}"/></td>
            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>

<div id="inputGradeForm" >
    <fieldset>
        <label>Year</label> <input type="text" id="yearCurrent1" name="currentYear" value="${selectedYear}" readonly/> <br/>
        <label>Semester </label><input type="text" id="semCurrent" name="currentSemester" value="${selectedSemester}" readonly/> <br/>
        <label>Id Student </label><input type="text" id="studCurrent" name="currentStudent" value="Student Id" readonly/> <br/>
        <label>Id Course</label> <input type="text" id="idCurrent" name="currentCourse" value="${selectedCourse}" readonly/> <br/>
        <label> Id Professor</label> <input type="text" id="idProfCurrent" name="professor"  value="${professorFullName}" readonly/> <br/>
        <label>Grade </label><input type="text" id="gradeCurrent" name="currentGrade" placeholder="Grade in procent" size="5" pattern="(?<=^| )\d+(\.\d+)?(?=$| )"/>
        <input type="text" id="letterGrade" name="grade" value="" readonly size="3"/> <br/>
        <div>
            <input id="btnClick" type="submit" value="Submit" />
            <img id="loader" src="/resources/images/loading.gif" alt="loading animation" width="50" height="50"/>
        </div>
    </fieldset>

</div>

</div>
<div id="tableGrade">
    <table id="tableGraded">
        <thead>
        <caption>Graded Students</caption>
        <tr>
            <th>year</th>
            <th>semester</th>
            <th>idStudent</th>
            <th>idCourse</th>
            <th>idProfessor</th>
            <th>grade</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${gradeReports}" var="gradeReport">
            <tr>
                <td><c:out value="${gradeReport.year}" /></td>
                <td><c:out value="${gradeReport.semester}" /></td>
                <td><c:out value="${gradeReport.idStudent}" /></td>
                <td><c:out value="${gradeReport.idCourse}" /></td>
                <td><c:out value="${gradeReport.idProfessor}" /></td>
                <td><c:out value="${gradeReport.grade}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
