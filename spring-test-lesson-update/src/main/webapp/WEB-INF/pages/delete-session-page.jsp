<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 10.07.2017
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete session</title>
</head>
<body>
<form action="/movie/delete-session" method="post">
    <b>movieSessionId:</b>
    <p><input type="text" name="movieSessionId" id="movieSessionId" ></p>
    <input type="submit" value="Delete">
    <button onclick="history.back()">Cancel</button>
</form>
</body>
</html>
