<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/24
  Time: 18:29
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
    <li class="layui-nav-item"><a href="manager_book.jsp">书库</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">出借记录</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_borrow.jsp">查询</a></dd>
            <dd><a href="manager_returnbook.jsp">收回</a></dd>
            <dd><a href="manager_lendout.jsp">出借</a></dd>
        </dl>
    </li>

    <li class="layui-nav-item"><a href="manager_violation.jsp">违规查询</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">注销</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_canceled_query.jsp">查询</a></dd>
            <dd><a href="manager_canceled.jsp">登记</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">丢失损毁</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_ld_query.jsp">查询</a></dd>
            <dd><a href="manager_ld.jsp">登记</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">图书征订</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_booklist.jsp">选项列表</a></dd>
            <dd><a href="manager_subscription.jsp">征订</a></dd>
            <dd><a href="manager_querysubscription.jsp">征订查询</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">罚款</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_fined_query.jsp">查询</a></dd>
            <dd><a href="manager_fined.jsp">登记</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item" layui-this>
        <a href="javascript:;">读者管理</a>
        <dl class="layui-nav-child">
            <dd><a href="manager_queryreader.jsp">查询</a></dd>
            <dd><a href="manager_addreader.jsp">注册</a></dd>
            <dd><a href="manager_modifyreader.jsp">修改</a></dd>
            <dd><a href="manager_deletereader.jsp">注销</a></dd>
        </dl>
    </li>
</ul>
<table id="ld"></table>

<script>

    layui.use('element', function () {
        var element = layui.element;
    })

    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#ld'
            , url: 'ldquery'
            , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[
                {field: "id", width: 80, title: '记录'}
                , {field: 'book_id', title: '书本编号', width: 160}
                , {field: 'reader_account', width: 160, title: '读者账号'}
                , {field: 'type', width: 160, title: '种类'}
                , {field: 'report_time', width: 160, title: '登记时间'}
            ]],
        });
    });
</script>
</body>
</html>
