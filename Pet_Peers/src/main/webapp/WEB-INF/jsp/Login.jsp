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
.error{
color: red;
margin-left: 30px;
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
<!-- <nav class="navbar navbar-inverse"> -->
<!--     <div class="container-fluid"> -->
<!--         <div class="navbar-header"> -->
<!--             <a class="navbar-brand" href="./">Pet Shop</a> -->
<!--         </div> -->
<!--     </div> -->
<!--     </nav> -->
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
<h1 align="center">Account Login</h1>
<div align="center">
<form:form action = "loginPage" modelAttribute = "login">
<table>
<tr><td></td><td><form:label path="" cssClass="error">${invalidLogin}</form:label></td></tr>
<tr>
<td><form:label path="userName">User Name:</form:label></td><td class = "glyphicon glyphicon-user"><form:input path="userName"/><form:errors path = "userName" cssClass="error"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="password">Password:</form:label></td><td class = "glyphicon glyphicon-lock"><form:password path="password"/><form:errors path = "password" cssClass="error"></form:errors><br><br></td>
</tr>
<tr><td></td><td><input class="btn btn-success" type = "submit" value = "Login"></td></tr>
<tr>
<td></td><td>Create New Account ?</td><td><a href = "registrationPage"><span class="glyphicon glyphicon-user"></span>SignUp</a>
</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>