<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>

<form action="${pageContext.request.contextPath}/user/checkLogin" method="post">
    <table>
        <tr>
            <td>电话号码:</td>
            <td><input id="tel" name="tel" type="text"></td>
        </tr>
        <tr>
            <td>登录密码:</td>
            <td><input id="psd" name="psd" type="password"></td>
        </tr>
        <tr >
            <td><input type="submit" value="登录" ></td>
            <td><input type="button" value="注册" onclick="window.location.href='/user/regist'"> </td>
        </tr>

    </table>
</form>

</body>
</html>