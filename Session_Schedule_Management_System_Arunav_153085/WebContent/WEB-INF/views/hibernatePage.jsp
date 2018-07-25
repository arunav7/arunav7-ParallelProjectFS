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
			<form:form action="hibernate" method="post" modelAttribute="scheduledSession">
				<h1> You are enrolled to: ${scheduledSession.name} </h1>
			</form:form>	
		</div>
	</body>
</html>