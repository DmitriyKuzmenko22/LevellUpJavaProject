<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 12.05.2017
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

  <form action="/welcome" method="post">
      <input name="login" type="text">
      <input name="password" type="password">
      <input type="submit" value="Login">
      <input name="proverka" type="text">
  </form>

</body>
</html>
