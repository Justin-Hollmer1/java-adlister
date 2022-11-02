<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: justinhollmer
  Date: 11/1/22
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<%--    <form METHOD="post" ACTION="login.jsp">--%>
<%--        <input type="text" name="username" placeholder="username">--%>
<%--        <input type="password" name="password" placeholder="password">--%>
<%--        <button type="submit"></button>--%>
<%--    </form>--%>
    <form METHOD="post" ACTION="http://localhost:8080/login.jsp">
        <input type="text" name="username" placeholder="username">
        <input type="password" name="password" placeholder="password">
        <button type="submit">Submit</button>
    </form>
<%--    <%!String username;%>--%>
<%--    <%username = request.getQueryString(); %>--%>
<%--    <c:if test="<%=username != null%>">--%>
<%--        <h1>Query String: <%=username%></h1>--%>
<%--    </c:if>--%>
<h1>${param.username}</h1>
<h1>${param.password}</h1>
<c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
    <%
        String site = "http://localhost:8080/profile.jsp";
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", site);
    %>
</c:if>
</body>
</html>
