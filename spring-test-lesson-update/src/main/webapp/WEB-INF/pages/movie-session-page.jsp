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
<c:forEach var="session" items="${allMovieSessions}"> <%--к каждому єлементу будем обращаться по имени сессионс
    --%>

    <%--<div>
        <span>c:out value="${session.movieSessionId}"</span> &lt;%&ndash;обращаемся через точку и обращаемся к полям&ndash;%&gt;
        <span>c:out value="${session.filmId}"</span>
        <span>c:out value="${session.sessionStartDate}"</span>
        <span>c:out value="${session.sessionStartTime}"</span>
    </div>--%> <%--можно и так--%>
    <div>movieSessionId|filmId|sessionStartDate|sessionStartTime|hallNumber|standardTicketPrice|comfortTicketPrice</div>|

    <div>
        <span><c:out value="${session.movieSessionId}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.filmId}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.sessionStartDate}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.sessionStartTime}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.hallNumber}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.standardTicketPrice}"/></span>
       <%-- <h2>|</h2>--%>
        <span><c:out value="${session.comfortTicketPrice}"/></span>
      <%--  <h2>|</h2>--%>
    </div>
<%--
    <div> mojno i tak
        <span>${session.movieSessionId}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.filmId}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.sessionStartDate}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.sessionStartTime}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.hallNumber}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.standardTicketPrice}|/></span>
            &lt;%&ndash; <h2>|</h2>&ndash;%&gt;
        <span>${session.comfortTicketPrice}|/></span>
            &lt;%&ndash;  <h2>|</h2>&ndash;%&gt;
    </div>--%>
</c:forEach>



</body>
</html>
