<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 04.07.2017
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> <%-- //для работі с скрплетами--%>
<html>
<head>
    <title>Movies</title>
</head>
<body>

<h1>Movie list:</h1>
<%--<div> рабочий вариат с лессона
    movieSessionId|filmId|sessionStartDate|sessionStartTime|hallNumber|standardTicketPrice|comfortTicketPrice
</div>--%>

<table bordercolor="red" border="2" width="100%">
    <thead>
    <tr>
        <td>movieSessionId</td>
        <td>filmId</td>
        <td>sessionStartDate</td>
        <td>sessionStartTime</td>
        <td>hallNumber</td>
        <td>standardTicketPrice</td>
        <td>comfortTicketPrice</td>
    </tr>
    </thead>
    <tbody>
<c:forEach var="session" items="${allMovieSessions}"> <%--к каждому єлементу будем обращаться по имени сессионс --%>
  <%--  <div>
        <span><c:out value="${session.movieSessionId}"/></span>
        <span><c:out value="${session.filmId}"/></span>
        <span><c:out value="${session.sessionStartDate}"/></span>
        <span><c:out value="${session.sessionStartTime}"/></span>
        <span><c:out value="${session.hallNumber}"/></span>
        <span><c:out value="${session.standardTicketPrice}"/></span>
        <span><c:out value="${session.comfortTicketPrice}"/></span>
    </div>--%>

    <tr>
        <td><c:out value="${session.movieSessionId}"/></td>
        <td><c:out value="${session.filmId}"/></td>
        <td><c:out value="${session.sessionStartDate}"/></td>
        <td><c:out value="${session.sessionStartTime}"/></td>
        <td><c:out value="${session.hallNumber}"/></td>
        <td><c:out value="${session.standardTicketPrice}"/></td>
        <td><c:out value="${session.comfortTicketPrice}"/></td>
    </tr>
   <%-- <div> рабочий вариант с лессона
        <span>${session.movieSessionId}|</span>
        <span>${session.filmId}|</span>
        <span>${session.sessionStartDate}|</span>
        <span>${session.sessionStartTime}|</span>
        <span>${session.hallNumber}|/></span>
        <span>${session.standardTicketPrice}|</span>
        <span>${session.comfortTicketPrice}|</span>
    </div>--%>
</c:forEach>
    </tbody>
    </table>


</body>
</html>
