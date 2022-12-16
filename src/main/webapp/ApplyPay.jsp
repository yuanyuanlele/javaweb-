<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交缴费申请</title>
</head>
<body>
<h3>总共租用${days}天,车位类型为${A.acptype},价格为${balance}</h3>
<form action="PayBill">
    <input type="submit" value="提交缴费申请">
</form>
</body>
</html>
