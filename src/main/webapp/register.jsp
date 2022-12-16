<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/12/14
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register"method="post">
    <table>
        <tr>
            <td>您的姓名：</td>
            <td><input type = "text" name = "Aname"></td>
        </tr>
        <tr>
            <td>您的房号：</td>
            <td><input type = "text" name = "Ahid"></td>
        </tr>
        <tr>
            <td>您的密码：</td>
            <td><input type = "password" name = "Apassword"></td>
        </tr>
        <tr>
            <td> 类型: </td>
            <td>
                <select name = "Atype">
                    <option value="户主">户主</option>
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
            <td>您的车位号：</td>
            <td><input type = "text" name = "Acpid"></td>
        </tr>
        <tr>
            <td>您的车辆型号：</td>
            <td><input type = "text" name = "Actype"></td>
        </tr>
        <tr>
            <td>您的车牌号：</td>
            <td><input type = "text" name = "Acname"></td>
        </tr>
        <tr>
            <td>您的手机号：</td>
            <td><input type = "text" name = "Aphone"></td>
        </tr>
        <tr>
            <td><input type = "submit" value ="注册"></td>
            <td><input type = "reset" value ="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
