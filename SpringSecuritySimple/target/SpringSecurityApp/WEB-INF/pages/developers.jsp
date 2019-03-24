<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Developers</title>
</head>
<body>

<h1><a href="/">Main menu</a></h1><br><br>

    <c:forEach items="${allDevelopers}" var="developer">
        <c:out value="${developer.name}"/><br>
    </c:forEach>

    <br><br>

    <form:form action="/developers/add" method="POST" modelAttribute="developer">
        <label>Name: <input type="text" name="name"></label><br>

        <form:checkboxes delimiter="<br>" items="${allSkills}" path="skills" title="name"/>

        <input type="submit" value="Save!">
    </form:form>

</body>
</html>
