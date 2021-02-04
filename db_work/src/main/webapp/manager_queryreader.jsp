<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/24
  Time: 18:32
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
<table id="reader"></table>

<script>

    layui.use('element', function () {
        var element = layui.element;
    })

    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#reader'
            , url: 'readerquery'
            , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[

                {field: 'account', title: '账号', width: 80}
                ,{field: 'name',width: 80,title: '姓名'}
                ,{field: 'password', width: 80, title: '密码'}
                ,{field: 'book_borrow_max',width: 160,title:'最多可借'}
                ,{field: 'renew_max',width:240,title:'最多可续借次数'}
                ,{field: 'time_available',width: 160,title: '可借时间(月)'}
                ,{field: 'kept_book',width: 160,title: '持有书数'}
                ,{field: 'violation',width: 160,title: '违规次数'}
                ,{field: 'sex',width: 80,title: '性别'}
                ,{field: 'phone',width: 80,title: '电话'}
                ,{field: 'address',width: 80,title: '地址'}
                ,{field: 'idcard',width: 120,title: '身份证'}
            ]],
        });
    });
</script>
</body>
</html>
