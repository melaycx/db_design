<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/21
  Time: 21:16
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

<table id="violation"></table>

<script>
    var account1 = "${sessionScope.user.account}";

    layui.use('element', function () {
        var element = layui.element;
    })

    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#violation'
            , url: 'readerviolation'
            , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[
                {field: "id", width: 80, title: '记录'}
                , {field: 'book_id', title: '书本编号', width: 160}
                , {field: 'reader_account', width: 160, title: '读者账号'}
                , {field: 'borrowed_time', width: 160, title: '借阅时间'}
                , {field: 'return_time', width: 160, title: '归还时间'}
                , {field: 'renew', title: '续借次数', width: 160}
                , {field: 'deadline', title: '截止日期', width: 160}
                , {field: 'out_or_in', width: 160, title: '是否归还'}
                , {field: 'out_operator', title: '外借操作人', width: 160}
                , {field: 'in_operator', width: 160, title: '收回操作人'}
            ]],
            where: {
                account: account1
            },
        });
    });
</script>
</body>
</html>
