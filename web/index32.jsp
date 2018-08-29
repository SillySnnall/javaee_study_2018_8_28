<%--
  Created by IntelliJ IDEA.
  User: SillySnnall
  Date: 2018/8/29
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp的Include指令测试</title>
</head>
<body>
<%--使用include标签引入引入其它JSP页面--%>
<%@include file="/head.jspf" %>
<h1>网页主体内容</h1>
<%@include file="/foot.jspf" %>
</body>
</html>
