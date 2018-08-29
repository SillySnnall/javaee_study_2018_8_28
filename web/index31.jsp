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
    <title>Form表单</title>
    <script type="text/javascript">
        var isCommitted = false;//表单是否已经提交标识，默认为false
        function dosubmit() {
            // if (isCommitted == false) {
            //     isCommitted = true;//提交表单后，将表单是否已经提交标识设置为true
            //     return true;//返回true让表单正常提交
            // } else {
            //     return false;//返回false那么表单将不提交
            // }

            // 除了用这种方式之外，经常见的另一种方式就是表单提交之后，将提交按钮设置为不可用，让用户没有机会点击第二次提交按钮
            //获取表单提交按钮
               var btnSubmit = document.getElementById("submit");
               //将表单提交按钮设置为不可用，这样就可以避免用户再次点击提交按钮
               btnSubmit.disabled= "disabled";
               //返回true让表单可以正常提交
               return true;
        }
    </script>
</head>

<body>
<form action="/demo31" method="post" onsubmit="return dosubmit()">
    用户名：<input type="text" name="username" value="倒计时啦接收到啦">
    <input type="submit" value="提交" id="submit">
</form>
</body>
</html>
