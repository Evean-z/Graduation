<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
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
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/message/updateMsg" method="post">

        <%--前端传递隐藏域--%>
        <input type="hidden" name="xxbh" value="${message.xxbh}">
        <div class="form-group">
            <label>信息标题</label>
            <input type="text" name="xxbt" class="form-control" value="${message.xxbt}" required>
        </div>
        <div class="form-group">
            <label>信息内容</label>
            <input type="text" name="xxnr" class="form-control" value="${message.xxnr}" required>
        </div>
        <div class="form-group">
            <label>发布人</label>
            <input type="text" name="fbr" class="form-control" value="${message.fbr}" required>
        </div>
        <div class="form-group">
            <label>发布时间</label>
            <input type="text" name="fbsj" class="form-control" value="${message.fbsj}" required>
        </div>


        <input type="submit" value="修改">
    </form>

</div>