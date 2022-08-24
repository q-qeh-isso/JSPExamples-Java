<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lendo os atributos de pessoa</title>
</head>
<body>

	<jsp:useBean id="pessoa" scope="session" class="web.negocio.Pessoa"></jsp:useBean>
	<h1 style="color:orange">Nome: </h1>
	<p style="color:#666"><jsp:getProperty property="nome" name="pessoa"/></p>
	<br/>
	
	<h1 style="color:orange">Idade: </h1>
	<p style="color:#666"><jsp:getProperty property="idade" name="pessoa"/><p>
	<br/>

</body>
</html>