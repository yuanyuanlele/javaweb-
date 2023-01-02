<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/15
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<script src="http://localhost:8080/javaweb5/static/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://localhost:8080/javaweb5/static/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://localhost:8080/javaweb5/static/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<html>
<head>
    <title>修改车主</title>
</head>
<body>
<form action="updateA?Aid=${a.aid}"method="post" class="table">
    <table>
        <tr>
            <td>姓名：</td>
            <td><input type = "text" name = "Aname" value="${a.aname}"></td>
        </tr>
        <tr>
            <td>房号：</td>
            <td><input type = "text" name = "Ahid" value="${a.ahid}"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type = "password" name = "Apassword" value="${a.apassword}"></td>
        </tr>
        <tr>
            <td> 类型: </td>
            <td>
                <select name = "Atype">
                    <option value="户主" >户主</option>
                    <option value="租户">租户</option>
                </select>
            </td>
        </tr>
        <tr>
            <td> 车位类型: </td>
            <td>
                <select name = "Acptype">
                    <option value="固定">固定</option>
                    <option value="活动">活动</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>车位号：</td>
            <td><input type = "text" name = "Acpid" value="${a.acpid}"></td>
        </tr>
        <tr>
            <td>车辆型号：</td>
            <td><input type = "text" name = "Actype" value="${a.actype}"></td>
        </tr>
        <tr>
            <td>车牌号：</td>
            <td><input type = "text" name = "Acname" value="${a.acname}"></td>
        </tr>
        <tr>
            <td>手机号：</td>
            <td><input type = "text" name = "Aphone" value="${a.aphone}"></td>
        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
