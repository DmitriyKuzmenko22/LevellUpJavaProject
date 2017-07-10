<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 09.07.2017
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update session</title>
</head>
<body>
<form action="/movie/update-session" method="post">

    <b>movieSessionId:</b>
    <p><input type="text" name="movieSessionId" id="movieSessionId" ></p>
    <b>filmId:</b>
    <p><input type="text" name="filmId" id="filmId"></p>
    <b>sessionStartDate:</b>
    <p><input type="date"name="sessionStartDate" id="sessionStartDate"> </p>
    <b>sessionStartTime</b>
    <p><input type="time" name="sessionStartTime" id="sessionStartTime"></p>
    <b>hallNumber:</b>
    <p> <input type="text" name="hallNumber" id="hallNumber"><br></p>
    <b>standardTicketPrice:</b>
    <p><input type="text" name="standardTicketPrice" id="standardTicketPrice"><br></p>
    <b>comfortTicketPrice:</b>
    <p><input type="text" name="comfortTicketPrice" id="comfortTicketPrice"><br></p>

    <input type="submit" value="Add">
    <button onclick="history.back()">Cancel</button>


</form>

</body>
</html>
