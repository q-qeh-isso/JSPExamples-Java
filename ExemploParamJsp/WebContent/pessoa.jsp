<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recebendo parâmetros da requisição</title>
</head>
<body>

	<h1>Nome: <%= request.getParameter("nome") %></h1>
	<h1>Idade: <%= request.getParameter("idade") %></h1>

</body>
</html>