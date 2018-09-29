

$(function() {
    // var table = $("#tabStudent").DataTable();
    var selectedRow;
    var stopLoader = function () {
        $("#loader").hide();
    };
    stopLoader();
    var showLoader = function () {
        $("#loader").show();
    };
    $('#tabStudent').find('tr').click( function(){
        var row = $(this).find('td:first').text();
        $(this).addClass("selectedRow");
        // alert("click on "+ row);
        $("#studCurrent").val(row);
        selectedRow = $(this);
    });




     $("#btnClick").click(function(){
         if($("#letterGrade").val()){
         var courseId = parseInt($("#idCurrent").val());
         var studentId = parseInt($("#studCurrent").val());
         var year = parseInt($("#yearCurrent1").val());
         var semester = parseInt($("#semCurrent").val());
         var prof = $("#idProfCurrent").val();
         var letter =$("#letterGrade").val();
         var grade = parseInt($("#gradeCurrent").val());

         //TODO GradeREport
             var params ={
                 year:year,
                 semester:semester,
                 idStudent:studentId,
                 idCourse:courseId,
                 idProfessor:prof,
                 grade:grade


             }


             $.post('gradeReport',{gradeReport: JSON.stringify(params)}, processData, "json");

         selectedRow.remove();

             $("#gradeCurrent").val("");
             $("#studCurrent").val("");
             $("#letterGrade").val("");
         } else{
             alert("Please fill the data");
         }
     });


function processData(data){

        console.log("hero!");
        var td0 = $("<td>").text(data.year);
        var td1 = $("<td>").text(data.semester);
        var td2 = $("<td>").text(data.idStudent);
        var td3 = $("<td>").text(data.idCourse);
        var td4 = $("<td>").text(data.idProfessor);
        var td5 = $("<td>").text(data.grade);

        var tr1 = $("<tr>").append(td0).append(td1).append(td2).append(td3).append(td4).append(td5);
        $("#tableGraded").append(tr1);
    }


    function checkFilled() {
        if (!$("#gradeCurrent").value) {
            $("#gradeCurrent").css({"background-color": "gold"});
        } else {
            $("#gradeCurrent").css({"background-color": "white"});
        }
    }

    $("#gradeCurrent").on("keypress",function(){
        var getJsonURL = "https://my-json-server.typicode.com/iVanea/gradeJson/db";
        showLoader();

        $.ajax({
            url: getJsonURL,
            type: "GET"
        }).always(stopLoader)
            .done(showData)
            .fail(showFailMessage);

    });

    function showData(data) {
        if (!data) {
            alert("Very bad, this id we don't have data. Try for another id!");
            return 0;
        }
        var ourGradeValue = $("#gradeCurrent").val();
        var indexGrade=0;
        for(var i = 60; i<=100; i=i+5){
            if(parseInt(ourGradeValue)<=parseInt(i)){
                indexGrade = parseInt(i);
                break;
            }
        }
        $("#letterGrade").val(data.grades[indexGrade]);
    }
    var showFailMessage = function (data) {
        alert("Error: 404 Data not found! \n Please try another ID.");
    };


});