<%--
  Created by IntelliJ IDEA.
  User: 30687
  Date: 2024/9/23
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--把表单内容提交到工程下的LoginServlet-->
<form action="LoginServlet" method="post">
    <p>Username: <input type="text" name="username"/><br/>
    Password:  <input type="password" name="password"/><br/></p>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
