<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
	background-color: silver;
}
</style>
<title>Registration Page</title>
</head>
<body>

<form:form action="add.htm" commandName="user">
	<table>
		<tr>
			<td>User Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><form:radiobutton path="gender" value="M" label="M" /> 
            	<form:radiobutton path="gender" value="F" label="F" /></td>
		</tr>
		<tr>
			<td>Country :</td>
			<td><form:select path="country">
				<form:option value="0" label="Select" />
				<form:option value="Azerbaycan" label="Azerbaijan" />
				<form:option value="Turkiye" label="Turkey" />
				<form:option value="India" label="India" />
				<form:option value="USA" label="USA" />
				<form:option value="UK" label="UK" />
			</form:select></td>
		</tr>
		<tr>
			<td>About you :</td>
			<td><form:textarea path="aboutYou" /></td>
		</tr>
		<tr>
			<td>University :</td>
			<td><form:checkbox path="university" value="OMU" label="OMU" />
                <form:checkbox path="university" value="ODTU" label="ODTU" />
                <form:checkbox path="university" value="ITU" label="ITU" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
	</table>
</form:form>
<c:if test="${fn:length(userList) > 0}">
	<table cellpadding="5">
		<tr class="even">
			<th>Name</th>
			<th>Gender</th>
			<th>Country</th>
			<th>About You</th>
		</tr>
		<c:forEach items="${userList}" var="user" varStatus="status">
			<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
				<td>${user.name}</td>
				<td>${user.gender}</td>
				<td>${user.country}</td>
				<td>${user.aboutYou}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>