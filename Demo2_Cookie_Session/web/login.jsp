<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2020/9/27
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            document.querySelector("#img").onclick = function () {
                this.src = "/checkCodeServlet?time="+new Date().getTime();
            }
        }
    </script>
    <style>
        div{
            color: red;
        }
    </style>
</head>
<body>
<form action="/LoginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkCode"></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="checkCodeServlet" alt="" ></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>

</form>
<div><%=request.getAttribute("login_error") == null?"":request.getAttribute("login_error")%></div>
<div><%=request.getAttribute("cc_error") == null?"":request.getAttribute("cc_error")%></div>


</body>
</html>
