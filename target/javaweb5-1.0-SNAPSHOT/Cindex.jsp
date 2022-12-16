<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>系统管理员</title>
</head>
<body>
<table>
    <tr>
        <th colspan="10">车主信息</th>
    </tr>
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>房号</th>
        <th>类型</th>
        <th>车位类型</th>
        <th>车位号</th>
        <th>车辆型号</th>
        <th>车牌号</th>
        <th>手机号</th>
        <th>选项</th>
    </tr>
    <c:forEach items="${Alist}" var="A">
    <tr>
        <td><c:out value="${A.aid}"></c:out></td>
        <td><c:out value="${A.aname}"></c:out></td>
        <td><c:out value="${A.ahid}"></c:out></td>
        <td><c:out value="${A.atype}"></c:out></td>
        <td><c:out value="${A.acptype}"></c:out></td>
        <td><c:out value="${A.acpid}"></c:out></td>
        <td><c:out value="${A.actype}"></c:out></td>
        <td><c:out value="${A.acname}"></c:out></td>
        <td><c:out value="${A.aphone}"></c:out></td>
        <td>
            <a href="http://localhost:8080/javaweb5/deleteA?Aid=${A.aid}">delete</a>
            <a href="http://localhost:8080/javaweb5/ToUpdateA?Aid=${A.aid}">update</a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>