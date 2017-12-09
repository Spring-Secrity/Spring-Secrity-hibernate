<%--
  Created by IntelliJ IDEA.
  User: Anlu
  Date: 2017/12/7
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
Dear <strong>${user}</strong>, Welcome to DBA Page.
<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>
