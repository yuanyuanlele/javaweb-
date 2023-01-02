<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/14
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<script src="http://localhost:8080/javaweb5/static/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://localhost:8080/javaweb5/static/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/javaweb5/static/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<html  >
<style>
    #father {
        width: 500px;
        height: 300px;
        position: relative;
    }

    #son {
        width: 100px;
        height: 100px;
        position: absolute;
        top: 0;
        right: 0;
        bottom: 0;
        left: 0;
        margin: auto;
    }
</style>

<head>
    <title>主页</title>
</head>
<body>
<div id="son">
<form class="table" action="loginCheck">
    <td>姓名：<input type="text" name="username"></td><br/>
    <td>密码：<input type="password" name="password"><td/><br/>
    <td><input class="btn btn-primary" type="submit" value="登录"><td/>
</form>
    <a href="http://localhost:8080/javaweb5/register.jsp">
        <button class="btn btn-primary">注册</button>
    </a>
</div>
</body>
</html>
