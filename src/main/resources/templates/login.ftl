<#--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<#--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>-->
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org" xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Title</title>
<#--    <link href="/css/styles.css" rel="stylesheet" type="text/css">-->
    <link rel="stylesheet" href="/css/main.css" />
    <link href="/css/bootsrtap.min.css" rel="stylesheet">

</head>
<body>









<div class="username-page-container">
    <form method="post" action="/login">

        <label for="login">Login:
        </label>
        <div class="form-group">
            <input required  type="text" id="login" name="login" value="roman2600" class="form-control">
        </div>
        <br/>

        <label for="login">Password
        </label>
        <div class="form-group">
            <input required class="form-control" type="password" id="password" name="password" value="123">
        </div>

        <#if error??>
            <div class="alert alert-danger" role="alert">Логин или пароль введены неверно</div>
        </#if>

        <label for="remember-me">Запомнить меня
            <input type="checkbox" name="remember-me" id="remember-me">
        </label>

        <br/>
<#--        <div class="">-->
        <button name="submit" type="submit" class="accent username-submit" >Sign in</button>
<#--        </div>-->


    </form>
</div>

</body>
</html>