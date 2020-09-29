<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2020/9/29
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${1+2}
${3%2}
${3 mod 2}
${3 == 2}
<%
    String str = "";
    request.setAttribute("str", str);
    ArrayList<Object> list = new ArrayList<>();
    request.setAttribute("list",list);
%>
${empty str}
${empty list}
</body>
</html>
