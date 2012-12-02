<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ficha de personal actualizada</title>
	</head>
	<body>
		<h3>Ficha de personal actualizada con los siguientes datos.</h3>
		<s:if test="person != null" >
			<p><s:property value="person" /></p>
		</s:if>
		<s:else>
		<p>El empleado no se ha encontrado.</p>
		</s:else>
		<p><a href="index.jsp">Buscar otro empleado</a></p>
		<p><a href="<s:url action='allPersonsFinder'/>">Listar todos los empleados</a></p>
	</body>
</html>