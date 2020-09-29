<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2020/9/29
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("name", "zs");
    request.setAttribute("name", "ls");
    session.setAttribute("age", 22);
    request.setAttribute("str", "");
    new User
%>
${requestScope.name}
${requestScope.str}
${sessionScope.name}
${sessionScope.age}
</body>
</html>
