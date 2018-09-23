<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div style="border: #6495ED 2px solid">

    <table id="tabCourse">
        <thead>
        <tr>
            <th>Id Student</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student">

            <tr>

                <td> <c:out value="${student}"/> </td>

            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>


<div style="border: #dddddd 2px solid">


    <table id="tab_gradeReports">
        <thead>
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

    <div style="border: #6495ED 2px solid">

        <fieldset>
            Year <input type="text" id="yearCurrent1" name="yearCurrent1" /> <br/>
            Semester <input type="text" id="semCurrent" name="semCurrent" /> <br/>
            Id Student <input type="text" id="studCurrent" name="studCurrent" /> <br/>
            Id Course <input type="text" id="idCurrent" name="idCurrent" /> <br/>
            Id Professor <input type="text" id="idProfCurrent" name="idProfCurrent" /> <br/>
            Grade <input type="text" id="gradeCurrent" name="gradeCurrent" /> <br/>

            <div>
                <input id="bt2" type="submit" value="Submit" />
            </div>
        </fieldset>


    </div>


</body>
</html>
