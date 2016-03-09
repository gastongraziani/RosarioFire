<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Entidades.*, CapaDatos.*, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
	<%!
	String titulo="Bienvenido al sistema de la biblioteca ";
	%>
	<title><%=titulo%></title>
	</head>
	<body bgcolor=orange>
		<center><h1><font color=black><%=titulo%></font></h1></center>
		
		<table>
			<tr>
				<td>
				    <form action="loginServlet" method="post"> 
						Usuario: <input type="text" name="un"/>	
						Contraseña: <input type="password" name="pw" /> 
						<input type="submit" value="Iniciar Sesion"> 
					</form> 
				</td>
			</tr>
			<tr>
				<td>				
					
				</td>
			</tr>
			<tr>
				<td>
				</td>
			</tr>	
		</table>
	</body>
</html>