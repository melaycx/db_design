<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/29
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css">
    <script type="text/javascript" src="resources/layui/layui.js"></script>
</head>
<body>
<ul class="layui-nav">
    <li class="layui-nav-item"><a href="reader_info.jsp">个人信息</a></li>
    <li class="layui-nav-item">
        <a href="javascript:">书库</a>
        <dl class="layui-nav-child">
            <dd><a href="reader_book.jsp">查询</a></dd>
            <dd><a href="reader_borrowbook.jsp">借书</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="reader_violation.jsp">违规</a></li>
    <li class="layui-nav-item">
        <a href="javascript:">历史借书</a>
        <dl class="layui-nav-child">
            <dd><a href="reader_borrow.jsp">查询</a></dd>
            <dd><a href="reader_returnbook.jsp">还书</a></dd>
            <dd><a href="reader_renewbook.jsp">续借</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:">罚款</a>
        <dl class="layui-nav-child">
            <dd><a href="reader_fined.jsp">查询</a></dd>
            <dd><a href="reader_finishfined.jsp">缴纳</a></dd>
        </dl>
    </li>
</ul>

<form class="layui-form" action="finishfined" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">请输入罚款记录编号</label>
        <div class="layui-input-inline">
            <input type="text" name="id" required lay-verify="required" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">缴纳</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
</html>
