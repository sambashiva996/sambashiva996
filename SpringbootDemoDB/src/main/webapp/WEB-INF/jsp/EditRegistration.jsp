<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Registration</title>
</head>
<body>
<div align="center">
<h1>Registration Details</h1>
         
<table border = "1">
        <tr>
            <td>Full Name</td>
            <td>Date Of Birth</td>
            <td>Gender</td>
            <td>Email</td>
            <td>Mobile Number</td>
            <td>Delete</td>
            <td>Edit</td>
        </tr>
        <c:forEach items="${editRegisterDeatails}" var="register">
            <tr>
                <td>${register.firstName} ${register.lastName}</td>
                <td>${register.dateOfBirth}</td>
                <td>${register.gender}</td>
                <td>${register.email}</td>
                <td>${register.mobileNumber}</td>
                
            </tr>
        </c:forEach>
    </table>
    </div>    
</body>
</html>