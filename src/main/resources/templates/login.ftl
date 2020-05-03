<#import "parts/common.ftl" as c>

<@c.page>
<div>
<form action = "/login" method = "post">
	<div><label> User Name <input type = "text" name = "us"/></label></div>
	<div><label> Password <input type = "password" name = "password/></label></div>
	<input type = "hidden" name = "_csrf" value = "@{_csrf.token}"/>
	<div><input type = "submit" value = "Sign in"/></div>

</form>
</div>
<a href="/registration">Add new user</a>

</@c.page>