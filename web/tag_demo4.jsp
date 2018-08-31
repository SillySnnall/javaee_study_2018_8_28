<%@ page language="java" pageEncoding="UTF-8"%>
<%--在jsp页面中导入自定义标签库 --%>
<%@taglib uri="/gacl" prefix="gacl" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>修改jsp页面内容输出</title>
</head>

<body>
<%--在jsp页面中使用自定义标签 demo4标签--%>
<gacl:demo4>
    <h3>xdp_gacl</h3>
</gacl:demo4>
</body>
</html>