<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>缴费记录物业收费员</title>
</head>
<body>
<table>
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
                <a href="http://localhost:8080/javaweb5/AllowPay?Did=${D.did}">通过</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>