<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Employee </title>
</head>
<body>
<%@page import="model.User" %>
<%@page import="model.Employee" %>
<%@page import="java.util.*"%>
<h2>Employee list</h2>
<form method="get" action="EmployeeListServlet">

<%! ArrayList<Employee> emplst ;  %>
<%

emplst=(ArrayList<Employee>)session.getAttribute("emplst");
%>
	<ul><% for(Employee e : emplst){%><li><%= e.getFirstName() +" "%><%= e.getLastName() %></li><%} %></ul>
<br/><br/>
<hr/>

<table border="1">
		<thead>
			<tr>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Role</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${sessionScope['emplst']}">
				<tr>
					<td>${emp.firstName}</td>
					<td>${emp.lastName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</form>
<form action="addEmployee.jsp"> <br/> <br/>
<input type="submit" value="add Employee" />
</form>
</body>
</html>