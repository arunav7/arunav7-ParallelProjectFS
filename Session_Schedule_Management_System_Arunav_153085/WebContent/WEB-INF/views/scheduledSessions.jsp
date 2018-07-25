<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
	<head>
		<title>Admin Profile</title>
	</head>
	<body>
		<div align="center">
			<table>
			   <tr>
			  	  <th> Session Name </th>
			  	  <th> Duration(days) </th>
			  	  <th> Faculty </th>
			  	  <th> Mode </th> 		
			   </tr>
			   <tr>
			      <td> Spring </td>
			      <td> 4 </td>
			      <td> Vihar </td>
			      <td> ILT </td>
			      <td> <a href="successSpring">Enroll Me</a> </td>
			   </tr>
			   <tr>
			      <td> Struts </td>
			      <td> 4 </td>
			      <td> Tarun </td>
			      <td> ILT </td>
			      <td> <a href="successStruts">Enroll Me</a> </td>
			   </tr>
			   <tr>
			      <td> Hibernate </td>
			      <td> 3 </td>
			      <td> Rekha </td>
			      <td> VC </td>
			      <td> <a href="successHibernate">Enroll Me</a> </td>
			   </tr>
			</table>
		</div>
	</body>
</html>