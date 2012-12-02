<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Ficha de empleado</title>
	</head>
	<body>
		<h3>Ficha del empleado localizada.</h3>
		<s:if test="person != null" >
			<s:url action="inputPersonUpdate" id="editUrl">
			   <s:param name="emplid" value="emplid"/>
			</s:url>
			<s:url action="personDelete" id="deleteUrl">
				<s:param name="emplid" value="emplid"/>
			</s:url>
			<p>
				<s:property value="person" /> <a href="<s:property value="#editUrl"/>">Editar</a> &nbsp;&nbsp; 
			    <a href="<s:property value="#deleteUrl"/>">Borrar</a> 
			</p>
		</s:if>
		<s:else>
		<p>Empleado no encontrado.</p>
		</s:else>
		<p><a href="index.jsp">Buscar otro empleado</a></p>
		<p><a href="<s:url action='allPersonsFinder'/>">Listar todos los empleados.</a></p>
		</body>
</html>