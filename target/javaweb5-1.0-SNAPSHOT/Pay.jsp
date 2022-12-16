<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>缴费</title>
</head>
<body>
<h4>选择缴费的起止时间</h4>
<form action="ApplyPay">
    <td>起始时间:<input type="text" name="begintime"></td>
    <td>终止时间:<input type="text" name="endtime"></td>
    <input type="submit" value="提交申请">
</form>
<a href="http://localhost:8080/javaweb5/DAindex">查看缴费记录</a>
</body>
</html>
