<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: justinhollmer
  Date: 11/2/22
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>National Parks</title>
</head>
<body>
<h1>National Parks</h1>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet consequatur delectus dolores eum harum iusto possimus quis sapiente voluptas. Ad deserunt ea facilis, incidunt ipsa mollitia necessitatibus nobis reiciendis tempora!</p>


<ul>
    <c:forEach items="${national-park-list}" var="national-park">
        <li>${national-park}</li>
    </c:forEach>
</ul>
</body>
</html>
