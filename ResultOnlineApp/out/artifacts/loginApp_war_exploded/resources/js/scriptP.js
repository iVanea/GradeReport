$(function(){

    $('.bt2').click(addEnrollACourse);

     function addEnrollACourse(){
         var yearC= $('#yearCurrent1').val();
         var sem= $('#semCurrent').val();
         var idStud= $('#studCurrent').val();
         var idC = $('#idCurrent').val();
         var idP = $('#idProfCurrent').val();
         var gradeC = $('#gradeCurrent').val();
         var gradeReport = {year:yearC,semester:sem,idStudent:idStud, idCourse:idC, idProfessor:idP,grade:gradeC};
         $.post('professor',{gradeReport: JSON.stringify(gradeReport)}, processData, "json")
     }

     function processData(data){
        var td0= $('<td>').text(data.year);
        var td1= $('<td>').text(data.semester);
        var td2 = $('<td>').text(data.idStudent);
        var td3 = $('<td>').text(data.idCourse);
        var td4 = $('<td>').text(data.idProfessor);
        var td5 = $('<td>').text(data.grade);
        var tr = $('<tr>').append(td0).append(td1).append(td2).append(td3).append(td4).append(td5);
        $('#tab_gradeReports tbody').append(tr);
    }

})






