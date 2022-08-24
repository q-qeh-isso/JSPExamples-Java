<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criando um objeto pessoa e definindo valores aos atributos</title>
</head>
<body>

	<h1>Objeto pessoa criado!</h1>
	<jsp:useBean id="pessoa" scope="session" class="web.negocio.Pessoa"></jsp:useBean>
	<jsp:setProperty property="nome" name="pessoa" param="paramNome" />
	<jsp:setProperty property="idade" name="pessoa" param="paramIdade" />
	
	<h1>Informações do objeto criado: </h1>
	<jsp:include page="lePessoa.jsp"></jsp:include>

</body>
</html>