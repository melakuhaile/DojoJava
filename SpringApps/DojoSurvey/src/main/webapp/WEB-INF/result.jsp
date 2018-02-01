
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: arial;">
	<fieldset style="width: 300px; height: 100px; border: solid;">
		<label>Name: <c:out value="${name}"/> </label>
		<br>
		<label>Dojo Location: <c:out value="${location}"/></label>
		<br>
		<label>Favorite Language: <c:out value="${language}"/></label>
		<br>
		<label>Comment: <c:out value="${comment}"/></label>
		<br>
	</fieldset>
	<br><a href="/home"><button>Go Back</button></a>
</body>

</html>