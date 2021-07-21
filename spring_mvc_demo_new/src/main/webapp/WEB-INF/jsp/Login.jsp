<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 align="center">Welcome to Login Page</h1>

<form:form action="nextPage" modelAttribute="login">
UserName:<form:input path="userName"/><form:errors path = "userName"></form:errors><br><br>
Password:<form:password path="password"/><form:errors path = "password"></form:errors><br><br>
Gender:
Male<form:radiobutton path="gender" value = "male"/>
Female<form:radiobutton path="gender" value = "female"/><form:errors path = "gender"></form:errors><br><br>
Hobbies:
Cricket<form:checkbox path="hobbies" value = "cricket"/>
Music<form:checkbox path="hobbies" value = "music"/>
E-Sports<form:checkbox path="hobbies" value = "eSports"/><br><br>
Date Of Birth:<form:input type = "date" path="dateOfBirth"/><form:errors path = "dateOfBirth"></form:errors><br><br>
<%-- Hobbies:<form:checkboxes items="hobbies" path=""/> --%>
<input type = "submit" value = "Submit"/>
</form:form>

</body>
</html>