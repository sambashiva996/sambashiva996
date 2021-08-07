<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Insert title here</title>
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
<!--             <a class="navbar-brand"><span class = "glyphicon glyphicon-home"></span> PetShop</a> -->
<!--         </div> -->
<!--         <ul class="nav navbar-nav navbar-right"> -->
<!--             <li><a href="logout"><span class="glyphicon glyphicon-off"></span> -->
<!--                     Logout</a></li> -->
<!--         </ul> -->
<!--     </div> -->
<!--     </nav> -->
<nav class="navbar navbar-primary">
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
<div align="center">
                       <h1>Pet Home</h1>
 
<table class="table table-bordered" border = "1" >
        <tr>
            <td>Pet Id</td>
            <td>Pet Name</td>
            <td>Pet Age</td>
            <td>Pet Place</td>
            <td>Buy/Sold</td>
        </tr>
        <c:forEach items="${listOfPet}" var="pet">
            <tr>
                <td>${pet.petId}</td>
                <td>${pet.petName}</td>
                <td>${pet.petAge}</td>
                <td>${pet.petPlace}</td>
                
                <c:if test="${pet.petBuyOrSold == 'Sold'}">
                <td><input type="button" value = "Sold Out" class="btn btn-danger" disabled="disabled"></td>
                </c:if>
                
                <c:if test="${pet.petBuyOrSold == 'Buy'}">
                <td><a class="btn btn-info" href = "buyOrSold/${pet.petId}">${pet.petBuyOrSold}</a></td>
                </c:if>
            </tr>
        </c:forEach>
    </table>
    </div>                                       
</body>
</html>