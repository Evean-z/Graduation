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
                    <small>用户列表 —— 显示所有用户</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/toAddUser">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/allUser">显示所有用户</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <form class="form-inline" action="${pageContext.request.contextPath}/user/findByName" method="post" style="float:right">
                <input type="text" name="uname" class="form-control" placeholder="请输入查询的用户名">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>用户编号</th>
                    <th>用户姓名</th>
                    <th>用户角色</th>
                    <th>联系电话</th>
                    <th>登陆密码</th>
                    <th>部门名称</th>
                    <th>用户权限</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${requestScope.list}">
                    <tr>
                        <td>${user.getUid()}</td>
                        <td>${user.getUname()}</td>
                        <td>${user.getRole()}</td>
                        <td>${user.getTel()}</td>
                        <td>${user.getPsd()}</td>
                        <td>${user.getDep()}</td>
                        <td>${user.getAuth()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/user/toUpdateUser?uid=${user.getUid()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/user/del/${user.getUid()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>