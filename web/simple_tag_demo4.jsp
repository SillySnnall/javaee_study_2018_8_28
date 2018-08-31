<%@ page language="java" pageEncoding="UTF-8"%>
<%--在jsp页面中导入自定义标签库 --%>
<%--<%@taglib uri="/simpletag" prefix="gacl" %>--%>
<%--在jsp页面中也可以使用这种方式导入标签库，直接把uri设置成标签库的tld文件所在目录 --%>
<%@taglib uri="/simpletag" prefix="gacl"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>用简单标签控制标签余下的Jsp不执行</title>
</head>

<body>
<h1>孤傲苍狼</h1>
<%--在jsp页面中使用自定义标签 --%>
<gacl:demo4/>
<!-- 这里的内容位于 <gacl:demo4/>标签后面，因此不会输出到页面上 -->
<h1>白虎神皇</h1>
</body>
</html>