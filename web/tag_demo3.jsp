<%@ page language="java" pageEncoding="UTF-8"%>
<%--在jsp页面中导入自定义标签库 --%>
<%@taglib uri="/gacl" prefix="gacl" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>控制页面内容重复执行5次</title>
</head>

<body>
<%--在jsp页面中使用自定义标签 demo3标签--%>
<gacl:demo3>
    <h3>jsp页面的内容</h3>
</gacl:demo3>
</body>
</html>