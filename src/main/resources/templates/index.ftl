<#import "parts/common.ftl" as c>

<@c.page>

<h1>Hello at our shop</h1>
<input type = "hidden" name = "_csrf" value = "@{_csrf.token}"/>

<a href="/registration">Add new user</a>
<a href="/login">Sign in</a>

</@c.page>