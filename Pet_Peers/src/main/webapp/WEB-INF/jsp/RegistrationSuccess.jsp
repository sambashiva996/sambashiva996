<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<title>RegistrationSuccess Page</title>
</head>
<body>
<%-- Customer Registered SuccessFully and Your Details: ${registration.firstName} ${registration.lastName} --%>
<%--                                                    ${registration.gender} --%>
<%--                                                    ${registration.hobbies} --%>
<%--                                                    ${registration.email} --%>
<%--                                                    ${registration.mobileNumber} --%>
<%--                                                    ${registration.address} --%>

<div align="center">
                       <h1>Registration Details</h1>
                                    <hr />
<table class="table table-bordered" border = "1" >
        <tr>
            <td>Full Name</td>
            <td>Date Of Birth</td>
            <td>Gender</td>
            <td>Email</td>
            <td>Mobile Number</td>
            <td></td>
        </tr>
        <c:forEach items="${registerDeatails}" var="register">

 

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