<%@ page import="el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2020/9/29
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setName("zz");
    user.setAge(22);
    user.setBirthday(new Date());
    request.setAttribute("user", user);
    List<Object> list = new ArrayList<>();
    list.add("a");
    list.add("bb");
    list.add("ccc");
    list.add(user);
    request.setAttribute("list", list);
    HashMap<String, Object> map = new HashMap<>();
    map.put("name", "zzz");
    map.put("user", user);
    request.setAttribute("map", map);
%>
${requestScope.user.name}
${requestScope.user.age}
${requestScope.user.birthday}
${user}
${user.birthday}
<h3>获取list</h3>
${requestScope.list}<br>
${list}<br>
${list[0]}<br>
<h3>第10</h3>
${list[10]}<br>

<h3>获取map</h3>
${requestScope.map}
${map.name}
${map["name"]}
${map.user.name}
</body>
</html>
