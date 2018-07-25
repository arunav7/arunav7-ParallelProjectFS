<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
	<head>
		<title>Success Page</title>
	</head>
	<body>
		<div align="center">
			<form:form action="struts" method="post" modelAttribute="scheduledSession">
			<input type="submit" value="Submit">
			</form:form>	
		</div>
	</body>
</html>