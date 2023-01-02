<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<script src="http://localhost:8080/javaweb5/static/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://localhost:8080/javaweb5/static/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/javaweb5/static/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<html>
<head>
    <title>缴费记录物业收费员</title>
</head>
<body>
<table class="table">
    <tr>
        <th colspan="6">缴费信息</th>
    </tr>
    <tr>
        <th>序号</th>
        <th>车主序号</th>
        <th>金额</th>
        <th>是否缴费</th>
        <th>通过</th>
    </tr>
    <c:forEach items="${Dlist}" var="D">
        <tr>
            <td><c:out value="${D.did}"></c:out></td>
            <td><c:out value="${D.aid}"></c:out></td>
            <td><c:out value="${D.dbalance}"></c:out></td>
            <td><c:out value="${D.dbool}"></c:out></td>
            <td>
                <a href="http://localhost:8080/javaweb5/AllowPay?Did=${D.did}">
                    <button class="btn btn-primary">通过</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
