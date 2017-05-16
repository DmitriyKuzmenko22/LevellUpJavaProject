<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 14.05.2017
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/registration" method="post">
    <span> Your Name </span>
    <input name="login" type="text">
    <span> Your password </span>
    <input name="password" type="password">

    <span> Your date of birth </span>
    <input name="dateBirth" type="date">
    <input type="submit" name="LoginButton" value="Registration">

</form>
</body>
</html>
