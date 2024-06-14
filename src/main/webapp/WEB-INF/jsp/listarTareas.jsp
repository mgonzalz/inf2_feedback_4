<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Listado de Tareas</title>
    <link href="/content/styles/styles.css" rel="stylesheet">
</head>
<body>
<h1>LISTADO DE TAREAS COMPLETO</h1>
<table border="1">
    <tr>
        <th>Título</th>
        <th>Descripción</th>
        <th>Completada</th>
        <th>Fecha Creacion</th>
    </tr>
    <c:forEach items="${tareas}" var="tarea">
        <tr>
            <td>${tarea.titulo}</td>
            <td>${tarea.descripcion}</td>
            <td>${tarea.completada}</td>
            <td>${tarea.fechaCreacion}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="/">Volver</a>
</body>
</html>