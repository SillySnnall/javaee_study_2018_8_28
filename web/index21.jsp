<%--
  Created by IntelliJ IDEA.
  User: SillySnnall
  Date: 2018/8/29
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在Form表单中使用验证码</title>
    <script type="text/javascript">
        //刷新验证码
        function changeImg(obj,createTypeFlag) {
            document.getElementById(obj.id).src="${pageContext.request.contextPath}/demo21?createTypeFlag="+createTypeFlag+"&"+Math.random();
        }
    </script>
</head>
<body>

<form action="/demo22" method="post">
           数字字母混合验证码：<input type="text" name="validateCode"/>
           <img alt="验证码看不清，换一张" src="/demo21" id="validateCodeImg1" onclick="changeImg(this,'nl')">
           <%--<br/>--%>
           <%--中文验证码：<input type="text" name="validateCode"/>--%>
           <%--<img alt="验证码看不清，换一张" src="/demo21?createTypeFlag=ch" id="validateCodeImg2" onclick="changeImg(this,'ch')">--%>
           <%--<br/>--%>
           <%--英文验证码：<input type="text" name="validateCode"/>--%>
           <%--<img alt="验证码看不清，换一张" src="/demo21?createTypeFlag=l" id="validateCodeImg3" onclick="changeImg(this,'l')">--%>
           <%--<br/>--%>
           <%--数字验证码：<input type="text" name="validateCode"/>--%>
           <%--<img alt="验证码看不清，换一张" src="/demo21?createTypeFlag=n" id="validateCodeImg4" onclick="changeImg(this,'n')">--%>
           <%--<br/>--%>
           <input type="submit" value="提交">
       </form>
</body>
</html>
