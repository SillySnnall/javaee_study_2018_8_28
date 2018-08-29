<%--
  Created by IntelliJ IDEA.
  User: SillySnnall
  Date: 2018/8/29
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request接收中文参数乱码问题</title>
</head>

<body>
<form action="/demo26" method="post">
    用户名：<input type="text" name="userName"/>
    <input type="submit" value="post方式提交表单">
</form>
</body>
</html>
