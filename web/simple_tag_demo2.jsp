<%@ page language="java" pageEncoding="UTF-8"%>
<%--在jsp页面中导入自定义标签库 --%>
<%@taglib uri="/simpletag" prefix="gacl" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>用简单标签控制标签体执行5次</title>
</head>

<body>

<%--在jsp页面中使用自定义标签 --%>
<gacl:demo2>
    孤傲苍狼<p/>
</gacl:demo2>
</body>
</html>