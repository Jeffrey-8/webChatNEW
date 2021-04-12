<%--
  Created by IntelliJ IDEA.
  User: Fonin572
  Date: 06.04.2021
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="get" action="/registration">
    <input name="signup" type="submit" value="New User">
</form>



<form  method="post" action="/auth">
    <input name="signup" type="submit" value="Existing user">
</form>

</body>
</html>
