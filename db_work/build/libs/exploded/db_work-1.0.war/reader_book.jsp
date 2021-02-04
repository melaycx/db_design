<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/22
  Time: 10:33
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

<table id="book" class="layui-hide"></table>
<script>

    layui.use('element', function () {
        var element = layui.element;
    })

    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#book'
            , url: 'book'
            , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            , cols: [[
                {field: "id", width: 160, title: '书本编号'}
                , {field: 'name', title: '书名', width: 160}
                , {field: 'version', width: 160, title: '版本'}
                , {field: 'author', width: 160, title: '作者'}
                , {field: 'type', width: 160, title: '种类'}
                , {field: 'publisher', title: '出版社', width: 160}
                , {field: 'price', title: '价格', width: 160}
                , {field: 'isbn', width: 160, title: 'isbn'}
                , {field: 'entry_time', title: '入库时间', width: 160}
                , {field: 'out_or_in', width: 160, title: '是否外借'}
            ]],
            page:true,
        });
    });
</script>


</body>
</html>
