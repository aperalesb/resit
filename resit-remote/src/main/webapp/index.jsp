<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Identificador de empleado</title>
	</head>
	<body>
		<h3>Introduzca el identificador del empleado que quieres buscar.</h3>
		<s:form action="personFinder">
		 	  <s:textfield name="emplid" label="Identificador de empleado" />
		   	  <s:submit/>
		</s:form>
		<p><a href="<s:url action='allPersonsFinder'/>">Listar todos los empleados.</a>.</p>
		<h3>Crear nuevo empleado.</h3>
		<p><a href="<s:url action='inputPersonSave'/>">Crear nuevo empleado.</a></p>
	</body>
</html>