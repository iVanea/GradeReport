$(function() {

    $('#tabCourse tbody tr').click(addEnrollACourse);


    function addEnrollACourse() {
        var data = table.row( this ).data();
        var yearCurrent=data[1];
        var semesterCurrent=data[2];
        var idC=data[3];
        var idP=data[4];
        var stud=data[5];

        var enrollACourse = {year: yearCurrent, semester: semesterCurrent, idStudent: stud, idCourse: idC,idProfessor:idP};

        $.post('coursesEnroll', {enrollACourse: JSON.stringify(enrollACourse)}, processData, "json")
    }






    var table = $('#tabCourse').DataTable();

    $('#tabCourse tbody').on('tr', function () {
        alert( table.row( this ).data() );
    } );







    function processData(data) {
        var td0 = $('<td>').text(data.idEnrollACourse);
        var td1 = $('<td>').text(data.year);
        var td2 = $('<td>').text(data.semester);
        var td3 = $('<td>').text(data.idStudent);
        var td4 = $('<td>').text(data.idCourse);
        var td5 = $('<td>').text(data.idProfessor);
        var tr = $('<tr>').append(td0).append(td1).append(td2).append(td3).append(td4).append(td5);
        $('#tb_enrollCourses tbody').append(tr);
    }





});







