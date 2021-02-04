<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/20
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="userAccount" class="cn.edu.zjut.po.UserAccount" scope="request"/>
<%--@elvariable id="userAccount" type="cn.edu.zjut.po.UserAccount"--%>

<form:form modelAttribute="userAccount" action="login" method="post">
    <table>
        <tr>
            <td><label>用户名</label></td>
            <td><form:input path="account"/></td>
        </tr>

        <tr>
            <td><label>密码</label></td>
            <td><form:password path="password"/></td>
        </tr>

        <tr>
            <td><label>身份</label></td>
        </tr>
        <tr>
            <td><label>管理员</label></td>
            <td><form:radiobutton path="type" value="0"></form:radiobutton></td>
            <td><label>读者</label></td>
            <td><form:radiobutton path="type" value="1"></form:radiobutton> </td>

        </tr>

        <tr><td colspan="2"><input type="submit" value="登录"></td></tr>
    </table>


</form:form>
</body>
</html>