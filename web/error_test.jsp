<%--
  Created by IntelliJ IDEA.
  User: SillySnnall
  Date: 2018/8/29
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="/error.jsp" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //这行代码肯定会出错，因为除数是0，一运行就会抛出异常
    int x = 1 / 0;
%>
</body>
</html>
