<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 09.07.2017
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add movie session</title>
</head>
<body>
<%--<form action="/movie/add-session" method="post">  OldWork


    <b>filmId:</b>
    <p><input type="text" name="filmId" id="filmId"></p>
    <b>hallNumber:</b>
    <p> <input type="text" name="hallNumber" id="hallNumber"><br></p>
    <b>standardTicketPrice:</b>
    <p><input type="text" name="standardTicketPrice" id="standardTicketPrice"><br></p>
    <b>comfortTicketPrice:</b>
    <p><input type="text" name="comfortTicketPrice" id="comfortTicketPrice"><br></p>

    <input type="submit" value="Add">
    <button onclick="history.back()">Cancel</button>


</form>--%>


<input type="text" name="filmId" id="filmId">
<input type="date" name="sessionStartDate" id="sessionStartDate">
<input type="time" name="sessionStartTime" id="sessionStartTime">
<input type="text" name="hallNumber" id="hallNumber">
<input type="text" name="standardTicketPrice" id="standardTicketPrice">
<input type="text" name="comfortTicketPrice" id="comfortTicketPrice">

<input type="button" onclick="addSession()" value="Add">
<button onclick="history.back()">Cancel</button>

<script>
    function addSession(event) {
        let filmId=document.getElementById("filmId").value;
        let sessionStartDate=document.getElementById("sessionStartDate").value;
        let sessionStartTime=document.getElementById("sessionStartTime").value;
        let hallNumber=document.getElementById("hallNumber").value;
        let standardTicketPrice=document.getElementById("standardTicketPrice").value;
        let comfortTicketPrice=document.getElementById("comfortTicketPrice").value;

        let session={filmId,sessionStartDate,sessionStartTime,hallNumber,standardTicketPrice, comfortTicketPrice};
        let sessionStr=JSON.stringify(session);

        console.log(sessionStr);

        let options={
            mode: "cors"
        };

        fetch('http://localhost:8080/movie/add-session',{
            method: "post",
            headers:{
                "Accept":"application/json",
                "Content-Type" : "application/json"
            },
            body: JSON.stringify(session),

        }).then(res=>console.log(res))

    }
</script>
</body>
</html>
