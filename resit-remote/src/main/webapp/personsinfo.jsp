<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Listado de personal</title>
	</head>
	<body>
		<h3>Listado completo de todo el personal.</h3>
		<s:iterator value="persons">
			<s:url action="inputPersonUpdate" id="editUrl">
				<s:param name="emplid" value="emplid"/>
			</s:url>
			<s:url action="personDelete" id="deleteUrl">
				<s:param name="emplid" value="emplid"/>
			</s:url>
		
			<p>
				<s:property />  
				<a href="<s:property value="#editUrl"/>">Editar</a> &nbsp;&nbsp; 
				<a href="<s:property value="#deleteUrl"/>">Eliminar</a>
			</p>
		</s:iterator>
		<p><a href="<s:url action='inputPersonSave'/>">Crear nuevo empleado.</a></p>
		<p><a href="index.jsp">Inicio</a></p>
	</body>
</html>