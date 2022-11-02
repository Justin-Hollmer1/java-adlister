<%--
  Created by IntelliJ IDEA.
  User: justinhollmer
  Date: 11/2/22
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess number</title>
</head>
<body>
  <form method="post" action="http://localhost:8080/guess">
    <label for="guess">Guess a number: </label>
    <input id="guess" name="guess">
  </form>
</body>
</html>
