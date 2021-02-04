<%--
  Created by IntelliJ IDEA.
  User: zml
  Date: 2020/12/22
  Time: 10:34
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

<form class="layui-form" action="readerinfo" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">账号</label>
        <div class="layui-input-inline">
            <input type="text" name="account" required  lay-verify="required"  class="layui-input" value="${sessionScope.user.account}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="name" required  lay-verify="required"  class="layui-input" value="${sessionScope.infodetail.name}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证</label>
        <div class="layui-input-inline">
            <input type="text" name="idcard" required  lay-verify="required"   class="layui-input" value="${sessionScope.infodetail.idcard}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-inline">
            <input type="text" name="sex" required  lay-verify="required"  class="layui-input" value="${sessionScope.sex}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">持有书籍</label>
        <div class="layui-input-inline">
            <input type="text" name="book" required  lay-verify="required"  class="layui-input" value="${sessionScope.info.kept_book}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">违规次数</label>
        <div class="layui-input-inline">
            <input type="text" name="violation" required  lay-verify="required"  class="layui-input" value="${sessionScope.info.violation}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">最多续借次数</label>
        <div class="layui-input-inline">
            <input type="text" name="renew_max" required  lay-verify="required"  class="layui-input" value="${sessionScope.info.renew_max}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">最多可借数目</label>
        <div class="layui-input-inline">
            <input type="text" name="book_borrow_max" required  lay-verify="required"  class="layui-input" value="${sessionScope.info.book_borrow_max}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">一次可借时间（月）</label>
        <div class="layui-input-inline">
            <input type="text" name="time_available" required  lay-verify="required"  class="layui-input" value="${sessionScope.info.time_available}" disabled>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">电话</label>
        <div class="layui-input-inline">
            <input type="text" name="phone" required  lay-verify="required"  value="${sessionScope.infodetail.phone}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">住址</label>
        <div class="layui-input-inline">
            <input type="text" name="address" required  lay-verify="required" value="${sessionScope.infodetail.address}"  class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">修改</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;
    });

    // form.on('submit(formDemo)', function (data) {
    //     console.log(data.field);
    //     return false;
    // });

</script>


</body>
</html>
