<#--<%---->
<#--  Created by IntelliJ IDEA.-->
<#--  User: Fonin572-->
<#--  Date: 06.04.2021-->
<#--  Time: 14:52-->
<#--  To change this template use File | Settings | File Templates.-->
<#----%>-->
<#--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/registration">
    <label for="login">Login:</label><br/>
    <input class="input-field" type="text" id="login" name="login" value="roman2600"><br/>
    <label for="password">Password:</label><br/>
    <input class="input-field" type="password" id="password" name="password" value="12345"><br/>
<#--    <label for="password">Confirm password:</label><br/>-->
<#--    <input class="input-field" type="password" id="passwordConfirm" name="password" value="12345"><br/>-->

    <label for="firstName">First name: </label><br/>
    <input class="input-field" type="text" id="firstName" name="firstName" value="Roman"><br/>
    <label for="lastName">Last name: </label><br/>
    <input class="input-field" type="text" id="lastName" name="lastName" value="Roman"><br/>

    <input name="submit" type="submit" value="Sign Up">
</form>

</body>
</html>
