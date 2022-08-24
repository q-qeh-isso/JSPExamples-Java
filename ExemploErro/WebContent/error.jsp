<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página de Erro</title>
</head>
<body style="color:orange;text-align:center;">

	<h1>Ocorreu um erro !</h1>
	
	<h2><%= exception.getMessage() %></h2>

</body>
</html>