<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Stock Fuera</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Alkatra&family=Dancing+Script&family=Delicious+Handrawn&family=Ysabeau:ital,wght@1,700;1,900&display=swap" rel="stylesheet">
  <link href="<c:url value="img/favicon.png"></c:url>" rel="icon">
</head>
<body>
<div class="container" style="font-family: 'Ysabeau', sans-serif;">
	<h1>Productos de Papelería</h1>
	<form action="Controller" method="post" class ="form-control needs-validation" novalidate style="font-family: 'Ysabeau', sans-serif;">
	<div class="shadow p-3 mb-3 bg-body rounded border border-danger bg-success p-2 text-dark">
		<label for="nombre" class="form-group text-capitalize">Nombre:</label>
		<input type="text" name="nombre" class="form-control text-capitalize" required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ ]+" maxlength="20">
		
		<div class="mb-3">
		<label for="descripcion" class="form-group text-capitalize">Descripción:</label>
		 <textarea class="form-control" id="descripcion1" rows="3" name="descripcion" placeholder="max. 100 caracteres" required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ ]+" maxlength="100"></textarea>
		</div>
		
		<label for="cantidad" class="form-group text-capitalize">Cantidad:</label>
		<input type="text" name="cantidad" class="form-control text-capitalize" required pattern="[0-9]{9}[9-1000]{1000}">
		
		<div class="row mt-1">
		<div class="col text center">
		<input type="submit" name="enviar" class="btn btn-dark border border-3 border border-danger" value="Aceptar">	
		</div>
		</div>
		</div>
	</form>
	<!--  Mostramos el mensaje que envía el controlador  -->
	<c:if test="${not empty msg}">
		<c:out value="${msg}"/>
	</c:if>
	<c:if test="${not empty productos}">
	<table class="table table-success table-striped">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Descripción</th>
			<th>Cantidad</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${productos}" var="pro">
		<tr>
			<td><c:out value="${pro.idProducto}"></c:out></td>
			<td><c:out value="${pro.nombreP}"></c:out></td>
			<td><c:out value="${pro.descripcionP}"></c:out></td>
			<td><c:out value="${pro.cantidadP}"></c:out></td>
			<td>
				<a href="javascript: history.go(-1)" class="btn btn-dark border border-2 border border-primary" role="button">Corregir &#9999;</a>
				<a href="javascript: history.go" class="btn btn-dark border border-2 border border-" role="button"> Borrar &#128465;</a>
			</td></tr>
	</c:forEach>
		</table>
	</c:if>
		</div>
	<script src="<c:url value="js/script.js"/>"></script> 
</body>
</html>