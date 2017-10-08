<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 12.07.2017
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hall</title>
</head>
<body>


<table class="table">
    <thead class="thead-inverse">
    </thead>
    <tbody id="user-table">
    </tbody>
</table>

<div align="center" >
    <div align="center" id="aa">
        <table class="table">
            <thead class="thead-inverse">
            </thead>
            <tbody id="user-table">
            </tbody>
        </table>
        <div>
            <input type="text" id="movie-session-id"/><span>
    <button onclick="getArray()">Load</button></span>
        </div>
    </div></div>

<script type="text/javascript">
    var userTable=document.getElementById("user-table");
    var allHalls=${allHalls};

    function draw(tickets) {

        clearTable(userTable);

        var currentHall=0;

        allHalls.forEach(function (p1) {
            if(p1.id.value==tickets[0].hallId.value){
                currentHall=p1;
            }
        })

        console.log(currentHall);

    }

    var rowsAndCels = [];
    var k = 0;

    for (var i=0;i<currentHall.rowsNumberInHall;i++){
        rowsAndCels[i]=userTable.insertRow(i);  /*v tablicy dobavlyaem novuyu stroky*/
        for(var j=0; j<currentHall.seatsNumberInHall; j++){
            rowsAndCels[i][j]=rowsAndCels.insertCell(j);
            rowsAndCels[i][j].innerHTML = '<img src="http://s1.iconbird.com/ico/0612/vistabasesoftwareicons/w256h2561339252444BoxGreen.png" width="40" height="40" alt="lorem">';

        }
        k++;
    }

    tickets.forEach(function (tickets) {
        var lineNum = tickets.lineNumber - 1;
        var seatNum = tickets.seatNumber - 1;
        console.log(lineNum);
        console.log(seatNum);
        rowsAndCels[lineNum][seatNum].innerHTML = '<img src="http://s1.iconbird.com/ico/2013/9/446/w512h5121380376664MetroUITask.png" width="40" height="40" alt="lorem">';
//            console.log(img2);
    });


    function clearTable(table) {
            table.innerHTML='';
        }
    function getArray() {


        var hallId = document.getElementById("movie-session-id").value;
        fetch('/movie/hall', {
            method: 'POST',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'},
            body: 'hallId=' + hallId
        }).then(function (response) {
            return response.json();
        })
            .then(function (list) {
                draw(list);
            }).catch(alert);

    }
</script>
</body>
</html>
