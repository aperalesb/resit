<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Editar personas</title>
	</head>
	<body>
		<h3>Rellene el formulario de abajo para editar el empleado.</h3>
		<s:if test="person != null" >
		     <s:form action="executePersonUpdate" method="post">
		     	<s:textfield name="person.first_name" label="Nombre" />
		     	<s:textfield name="person.last_name" label="Apellido" />
		     	<s:hidden name="person.emplid" />
		     	<s:submit />
		     </s:form>
		</s:if>
		<s:else>
			<p>Lo sentimos, no hemos podido localizar el empleado.</p>
			</s:else>
			<p><a href="index.jsp">Buscar otro empleado</a></p>
			<p><a href="<s:url action='allPersonsFinder'/>">Listar todos los empleados.</a></p>
		</body>
</html>