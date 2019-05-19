<%--
  Created by IntelliJ IDEA.
  User: grzechu
  Date: 2019-05-19
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Login Form</h1>

<form action="${pageContext.request.contextPath}/login" method="post">
    <p>
        <input type="hidden" name="submitted" value="true">
        Login: <input type="text" name="login"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" name="action" value="Log in">
    </p>
</form>

<c:if test="${param.submitted}">
    <h3>Login not successful</h3>
</c:if>

</body>
</html>
