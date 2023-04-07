<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="insert" modelAttribute="empobject">
email<form:input path="email" /><br>

pwd<form:input path="pwd" /><br>
name<form:input path="name" /><br>
phno<form:input path="phno" /><br>
	role	<form:input path="role" /><br>
		<form:button>submit</form:button><br>
	</form:form>


</body>
</html>