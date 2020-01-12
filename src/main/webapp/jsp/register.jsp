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
<h3>Enter User Details</h3>

<c:if test="${not empty message}">
<h2> <c:out value="${message}"></c:out> </h2>
</c:if>


<form:form modelAttribute="registerUserForm" action="/registeruser">
	<table>
		<tr>
			<td>
				<form:label path="name">Name</form:label>
			</td>
			<td>
				<form:input path="name"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="age">Age</form:label>
			</td>
			<td>
				<form:input path="age"/>
			</td>
		</tr>
		
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
				<button type="submit">Register</button>
			</td>
		</tr>
		
	</table>
</form:form>

</body>
</html>