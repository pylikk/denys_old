<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ьф
  Date: 28.10.2017
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Skills</title>
</head>
<body>
<h1><a href="/">Main menu</a></h1><br><br>


    <c:forEach items="${allSkills}" var="skill">
        <c:out value="${skill.name}"/><br>
    </c:forEach>

    <br><br>

    <form action="/skills/add" method="POST">
        <input type="text" name="name"/>
        <input type="submit" value="Save!">
    </form>


</body>
</html>
