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

    <form action="${pageContext.request.contextPath}/user/updateUser" method="post">

        <%--前端传递隐藏域--%>
        <input type="hidden" name="uid" value="${user.uid}">
        <div class="form-group">
            <label>用户姓名</label>
            <input type="text" name="uname" class="form-control" value="${user.uname}" required>
        </div>
        <div class="form-group">
            <label>用户角色</label>
            <input type="text" name="role" class="form-control" value="${user.role}" required>
        </div>
        <div class="form-group">
            <label>联系电话</label>
            <input type="text" name="tel" class="form-control" value="${user.tel}" required>
        </div>
        <div class="form-group">
            <label>登陆密码</label>
            <input type="text" name="psd" class="form-control" value="${user.psd}" required>
        </div>
        <div class="form-group">
            <label>部门名称</label>
            <input type="text" name="dep" class="form-control" value="${user.dep}" required>
        </div>
        <div class="form-group">
            <label>用户权限</label>
            <input type="text" name="auth" class="form-control" value="${user.auth}" required>
        </div>
        <input type="submit" value="修改">
    </form>

</div>