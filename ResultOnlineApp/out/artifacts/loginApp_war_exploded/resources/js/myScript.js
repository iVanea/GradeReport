$(function(){

    $('.bttest').click(addEnrollACourse);

   /* function addEnrollACourse(){
        var idStud= $('#id_Student').val();
        var idC = $('#id_Course').val();
        var bl = $('#b_block').val();
        var enrollACourse = {idStudent:idStud, idCourse:idC, block:bl};
        $.post('enroll',{enrollACourse: JSON.stringify(enrollACourse)}, processData, "json")
    }*/


    function addEnrollACourse(){
        var selecred_btn_id = $(this).attr("id");
       /* alert(selecred_btn_id + "test0");
        var sel_task_id = $("Task"+selecred_btn_id).attr("id");

        alert(sel_task_id + "test1");
        var idC = $("Task"+selecred_btn_id).attr("id");
        alert(idC + "test2");*/

        var enrollACourse = {idCourse:selecred_btn_id};

        $.post('enroll',{enrollACourse: JSON.stringify(enrollACourse)}, processData, "json")
    }

    function processData(data){
        var td0= $('<td>').text(data.idEnrollACourse);
        var td1 = $('<td>').text(data.idStudent);
        var td2 = $('<td>').text(data.idCourse);
        var td3 = $('<td>').text(data.block);
        var tr = $('<tr>').append(td0).append(td1).append(td2).append(td3);
        $('#tb_enrollCourses tbody').append(tr);
    }

})


