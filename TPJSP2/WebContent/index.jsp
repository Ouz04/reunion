<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connection</title>
</head>
<body>

	<div class="container">
		<form action="LoginServlet" method="post">
			<%
				if (request.getAttribute("msgError") != null) {
			%>
			<div class="alert alert-danger" role="alert">
				<%=request.getAttribute("msgError")%></div>
			<%
				}
			%>
			<div class="form-group">
				Username : <input name="username" type="text" class="form-control"></input>
			</div>
			<div class="form-group">
				Password :<input name="password" type="password"
					class="form-control"></input>
			</div>

			<input type="submit" value="Connection" class="btn btn-primary" />

		</form>
	</div>
	
</body>
</html>