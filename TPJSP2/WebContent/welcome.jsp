<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Employee </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

</head>
<body>
<%@page import="model.User" %>
<%@page import="model.Employee" %>
<%@page import="java.util.*"%>


<%
 User userBean = (User)session.getAttribute("user");

%>

<div class="container">
<label> Bonjour <%=userBean.getEmp().getFirstName() %> </label>
<div class="row">
<form method="get" action="welcomeServlet/employee">

<input type="submit" value="list employee" class="btn btn-primary"/><br/> <br/>

</form>
<form action="welcomeServlet/logout" method="get">
<input type="submit" value="Deconnection"  class="btn btn-danger"/>
</form>
</div>

</div>
</body>
</html>