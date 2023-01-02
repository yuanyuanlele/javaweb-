<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<script src="http://localhost:8080/javaweb5/static/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://localhost:8080/javaweb5/static/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/javaweb5/static/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<html>
<head>
    <title>缴费</title>
</head>
<body>
<h4>选择缴费的起止时间</h4>
<form action="ApplyPay" class="table">
    <td>起始时间:<input type="text" name="begintime"></td>
    <td>终止时间:<input type="text" name="endtime"></td>
    <input type="submit" value="提交申请" class="btn btn-primary">
</form>
<a href="http://localhost:8080/javaweb5/DAindex">
    <button class="btn btn-primary">查看缴费记录</button>
</a>
</body>
</html>
