<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Insert title here</title>
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
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav navbar-right">
    <li><a href="logout"><span class="glyphicon glyphicon-off"></span>
    Logout</a></li>
    </ul>
    <ul class="nav navbar-nav">
      <li class="active"><a class="navbar-brand" href="homePage"><span class = "glyphicon glyphicon-home"></span> Pet Home</a></li>
      <li><a href="addPetPage" class = "glyphicon glyphicon-plus-sign"> AddPet</a></li>
      <li><a href="myPetPage" class = "glyphicon glyphicon-user"> MyPet</a></li>
    </ul>
  </div>
</nav>   
    <h1 align="left">Enter Pet Details</h1>
<div align="center">
<form:form action="loadPetPage" modelAttribute="petData">
<table class="table table-bordered" border = "1">

<form:hidden path="petBuyOrSold" value = "Buy"/>
<tr>
<td><form:label path="petName">Pet Name:</form:label></td><td><form:input path="petName"/><form:errors path = "petName"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="petAge">Pet Age:</form:label></td><td><form:input path="petAge"/><form:errors path = "petAge"></form:errors><br><br></td>
</tr>
<tr>
<td><form:label path="petPlace">Pet Place:</form:label></td><td><form:input path="petPlace"/><form:errors path = "petPlace"></form:errors><br><br></td>
</tr>
<tr><td></td><td><input class="btn btn-success" type = "submit" value = "AddPet"/> <a href = "addPetPage" class="btn btn-primary">Cancel</a></td></tr>
</table>
</form:form>
</div>
</body>
</html>