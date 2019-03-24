<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<title>Spring MVC</title>
<body>

<form action="/developer/add" method="post">
    <input type="text" name="name"/><br>

    <c:forEach items="${allSkills}" var="skill">
        <label><input type="checkbox" name="skills" value="${skill.name}"/>${skill.name}</label><br>
    </c:forEach>

    <input type="submit" value="save">
</form>

</body>
</html>
