<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="nextPage" modelAttribute="login">
UserName:<form:input path="userName"/><form:errors path="userName"></form:errors><br/><!-- revathi -->
Password:<form:password path="password"/><form:errors path="password"></form:errors><br/><!-- revathi -->
<input type="submit" value="submit">
</form:form>
</body>
</html>