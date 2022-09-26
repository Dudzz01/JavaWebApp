<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Document</title>
	</head>

	<body>
	 <h1>Homepage</h1>
	 <h3>
		Bem vindo 
		<% 
		String msg = (String)request.getSession().getAttribute("Username"); 
		out.print(msg);          
		%>
	</h3>
   <a href="http://localhost:8080/webapp/register.jsp">Clique aqui para registrar clientes</a>
	</body>

</html>