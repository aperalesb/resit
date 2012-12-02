<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Borrado de personas</title>
	</head>
	<body>
		<h3>La persona se eliminó correctamente.</h3>
		<p>Datos del empleado eliminado: <s:property value="person" /></p>
		<p><a href="index.jsp">Buscar otro empleado</a></p>
		<p><a href="<s:url action='allPersonsFinder'/>">Listar todos los empleados.</a></p>
	</body>
</html>