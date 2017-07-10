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
<form action="/movie/add-session" method="post">

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


</form>
</body>
</html>
