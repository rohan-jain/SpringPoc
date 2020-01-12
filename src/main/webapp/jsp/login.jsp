<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Login User</h3>




	<form:form method="POST"  action="/login">
		<table>
			<tr>
				<td><label for="username">Email address</label> <input
					id="username" name="username" type="email"
					placeholder="Enter email" /></td>
			</tr>
			<tr>
				<td><label for="password">Password</label> <input
					type="password" id="password" name="password" class="form-control"
					placeholder="Password" /></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Sign In</button>
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>