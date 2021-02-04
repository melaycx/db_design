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
<table id="fined"></table>
<%--<script type="text/html" id="barDemo">--%>
<%--    <button type="button" class="layui-btn" onclick="loadXMLDoc()">缴纳</button>--%>
<%--</script>--%>
<script>


    let account1 = "${sessionScope.user.account}";
    layui.use('element', function () {
        let element = layui.element;
    })
    layui.use('table', function () {
        let table = layui.table;
        table.render({
            elem: '#fined',
            url: 'readerfined',
            cellMinWidth: 80,
            cols: [[
                {field: 'id', title: '罚款编号', width: 160},
                {field: 'reader_account', title: '读者账号', width: 160},
                {field: 'book_id', title: '图书编号', width: 160},
                {field: 'fined_time', title: '罚款日期', width: 160},
                {field: 'fined_amount', title: '罚款金额', width: 160},
                {field: 'finished', title: '是否完成', width: 160},
                {field: 'finished_time', title: '完成时间', width: 160},
                {field: 'operator', title: '登记人', width: 160}
                // {title: '操作', toolbar: '#barDemo', width: 160}
            ]],
            where: {
                account: account1
            },
        });
    });

    function req(method, url, body, callback) {
        let form;

        if (method === 'get') {
            form = new Request(url, {
                method: 'get'
            })
        } else if (method === 'post') {
            form = new Request(url, {
                method: 'post', headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8;'
                }, body: body
            })
        } else {
            console.log("no such method");
        }

        fetch(form).then((it) => {
            it.text().then((result) => {
                callback(result)
            })
        })
    }

    function loadXMLDoc() {
        req("get", "testAjax?account=123", "", (text) => {
            console.log(text);
        })
    }
</script>
</body>
</html>
