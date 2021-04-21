<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
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
                    <small>公告信息列表 —— 显示所有公告信息</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/message/toAddMsg">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/message/allMsg">显示所有信息</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <form class="form-inline" action="${pageContext.request.contextPath}/message/findOneMsg" method="post" style="float:right">
                <input type="text" name="xxbt" class="form-control" placeholder="请输入查询的标题">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>信息编号</th>
                    <th>信息标题</th>
                    <th>信息内容</th>
                    <th>发布人</th>
                    <th>发布时间</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="message" items="${requestScope.list}">
                    <tr>
                        <td>${message.getXxbh()}</td>
                        <td>${message.getXxbt()}</td>
                        <td>${message.getXxnr()}</td>
                        <td>${message.getFbr()}</td>
                        <td>${message.getFbsj()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/message/toUpdateMsg?xxbh=${message.getXxbh()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/message/deleteMsg/{message.getXxbh()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>