<%@ page language="java" pageEncoding="UTF-8"%>
<%--在jsp页面中导入自定义标签库 --%>
<%--<%@taglib uri="/simpletag" prefix="gacl" %>--%>
<%--在jsp页面中也可以使用这种方式导入标签库，直接把uri设置成标签库的tld文件所在目录 --%>
<%@taglib uri="/simpletag" prefix="gacl"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>用简单标签修改jsp页面内容输出</title>
</head>

<body>

<%--在jsp页面中使用自定义标签 --%>
<gacl:demo3>
    gacl_xdp
</gacl:demo3>
</body>
</html>