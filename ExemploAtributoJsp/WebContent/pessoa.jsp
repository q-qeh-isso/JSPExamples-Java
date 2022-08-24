<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="web.negocio.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mostrando os dados da pessoa</title>
</head>
<body>

	<h1>Dados enviados da pessoa: </h1><br/>
	<%
		Pessoa pessoa = (Pessoa)session.getAttribute("pessoa");
	%>
	
	<h2>Nome: <%= pessoa.getNome() %></h2><br/>
	<h2>Idade: <%= pessoa.getIdade() %></h2><br/>

</body>
</html>