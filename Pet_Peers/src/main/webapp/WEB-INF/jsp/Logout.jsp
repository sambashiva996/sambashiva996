<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.logout{
color: green;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-bottom">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PetPeers</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Contact us</a></li>
      <li><a href="#"></a></li>
      <li><a href="#"></a></li>
      <li><a href="#"></a></li>
    </ul>
  </div>
</nav>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a class="navbar-brand" href="#"><span class = "glyphicon glyphicon-home"></span> Pet Home</a></li>
<!--       <li><a href="addPetPage" class = "glyphicon glyphicon-plus-sign"> AddPet</a></li> -->
<!--       <li><a href="myPetPage" class = "glyphicon glyphicon-user"> MyPet</a></li> -->
    </ul>
  </div>
</nav> 
<h1 align="center"></h1>
<div align="center">
<table>
<tr><td><h1 class="logout">${logout}</h1></td></tr>
</table>
<a href="./"><span class="glyphicon glyphicon-user"></span>
                    Login To Again</a>
</div>
</body>
</html>