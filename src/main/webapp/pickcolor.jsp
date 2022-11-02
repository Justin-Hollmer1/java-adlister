<%--
  Created by IntelliJ IDEA.
  User: justinhollmer
  Date: 11/2/22
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form method="post" action="http://localhost:8080/displayColor">
        <label for="pickcolor">Choose color</label>
        <input id="pickcolor" name="pickcolor">
        <button type="submit">Submit</button>
    </form>
</body>
</html>
