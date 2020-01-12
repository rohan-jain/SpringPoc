<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Login User</h3>


<form:form method="POST" modelAttribute="loginForm" action="/login">
	<table>
		
		<tr>
			<td>
				<form:label path="email">email</form:label>
			</td>
			<td>
				<form:input path="email"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="password">password</form:label>
			</td>
			<td>
				<form:password path="password"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit">Login</button>
			</td>
		</tr>
		
	</table>
</form:form>

</body>
</html>