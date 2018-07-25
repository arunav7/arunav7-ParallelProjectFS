<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
	<head>
		<title>Index Page</title>
	</head>
	<body bgcolor="aqua">
	   
	   <div align="center" style="background-color: white;">
	     <h3 style="color: olive;"> Administrator Login </h3>
	   </div>
       <br/>	
	   <div align="center">
			<form:form action="loginAdmin" method="post">
				<table style="border: thick; border-style: solid;">
					<tr>
						<td>
							Username: 
						</td>
						<td>
							<input type="text" name="username" placeholder="UserName is admin" required="required" />
						</td>
					</tr>
					<tr>
						<td>
							Password:
						</td>
						<td>
							<input type="password" name="password" placeholder="Password is admin" required="required"/>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<input type="submit" value="Login"/>
						</td>
					</tr>
				</table>  
			</form:form>
		</div>	
	</body>
</html>