<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Question Dashboard</title>
</head>
<body>
<div align="center">
<h1 style="color:#666699">Questions Dashboard</h1>

<table frame="box">
	<tr>
		<th>Question</th>
		<th>Tags</th>
		
	</tr>
	<c:forEach items ="${questionList}" var="question" >
		<tr>
			<td><a href="/questions/${question.id}">${question.question}</a></td>
			
			<td><c:forEach var="tag" items="${question.tags}" varStatus="loop">
					<button><a href="/questions/${question.id}">${tag.subject}</button></c:forEach></td>
		</tr>
	</c:forEach>
</table>

<a href="/questions/new">New Question</a>

</div>

</body>
</html>