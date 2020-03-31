<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="modelo.bean.*" %>


<!doctype html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Insertar Producto</title>
  </head>
  <body>
    <h1>Inserta un producto</h1>
    
    <form action="InsertarProducto" method="GET">
    
    <table>
    
    <tr><td> Nombre: </td><td><input type="text" name="nombre"></td></tr>
    <tr><td> Stock: </td><td><input type="text" name="stock"> </td></tr> 
    <tr><td> Fecha de la compra: </td><td><input type="text" name="fecha"></td></tr> 
    <tr><td> Color: </td><td><input type="text" name="color"> </td></tr>
    <tr><td> Precio:</td><td> <input type="text" name="precio"></td></tr> 
    <tr><td> Procedencia:</td><td> <input type="text" name="made_in"></td></tr> 
    <tr><td> Descuento: </td><td><input type="text" name="descuento"></td></tr>
    
    
    <input type="submit" value="Insertar" >
    
    </table>
    </form>
    
   
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>