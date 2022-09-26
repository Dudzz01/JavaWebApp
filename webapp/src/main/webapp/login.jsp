<%@ page language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
</head>

<body>
	<form action="login" method="post">
		 <label>username</label><br>
     <input name="Username" type="text"><br>
		 <label>password</label><br>
     <input name="Password" type="password"><br>
		 <p>
			<% 	
			String msg = (String)request.getAttribute("msgError"); 
			if(msg!=null)
			{
         out.print(msg);
			}          
			%>
		 </p>
     <input type="submit"><br>
	</form>
</body>

</html>