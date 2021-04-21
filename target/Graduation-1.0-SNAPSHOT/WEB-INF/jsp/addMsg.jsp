<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增用户</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/message/addMsg" method="post">

        <div class="form-group">
            <label>信息标题</label>
            <input type="text" name="xxbt" class="form-control" required>
        </div>
        <div class="form-group">
            <label>信息内容</label>
            <input type="text" name="xxnr" class="form-control" required>
        </div>
        <div class="form-group">
            <label>发布人</label>
            <input type="text" name="fbr" class="form-control" required>
        </div>

        <div class="layui-inline">
            <label class="layui-form-label">发布日期</label>
            <div class="layui-input-block">
                <input type="text" name="fbsj" lay-verify="date" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
                <input type="submit" value="添加">
            </div>
        </div>
    </form>

</div>