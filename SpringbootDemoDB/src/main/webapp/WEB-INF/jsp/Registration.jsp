<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"></head>
<title>Registration Page</title>
</head>
<body>
<h1 align="center">Welcome to Registration Page</h1>

<form:form action="nextPage" modelAttribute="registration">

<form:hidden path="custId"/>


FirstName:<form:input path="firstName"/><form:errors path = "firstName"></form:errors><br><br>
LastName:<form:input path="lastName"/><form:errors path = "lastName"></form:errors><br><br>
Gender:
Male<form:radiobutton path="gender" value = "male"/>
Female<form:radiobutton path="gender" value = "female"/><form:errors path = "gender"></form:errors><br><br>
Hobbies:
Cricket<form:checkbox path="hobbies" value = "cricket"/>
Music<form:checkbox path="hobbies" value = "music"/>
E-Sports<form:checkbox path="hobbies" value = "eSports"/><br><br>
Date Of Birth:<form:input type = "date" path="dateOfBirth"/><form:errors path = "dateOfBirth"></form:errors><br><br>
Email-Id:<form:input path="email"/><form:errors path = "email"></form:errors><br><br>
Mobile Number:<form:input path="mobileNumber"/><form:errors path = "mobileNumber"></form:errors><br><br>
Address:<form:textarea path="address"/><form:errors path = "address"></form:errors><br><br>
<%-- Hobbies:<form:checkboxes items="hobbies" path=""/> --%>
<input class="btn btn-success" type = "submit" value = "Registration"/>
</form:form>

</body>
</html>