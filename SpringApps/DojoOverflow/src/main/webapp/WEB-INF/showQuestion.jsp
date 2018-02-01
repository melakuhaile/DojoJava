<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Question profile</title>
</head>
<body>
<div align="center">


<h1>${question.question}</h1>

<h3>Tags: <c:forEach var="tag" items="${questionTags}">
<button>${tag.subject}</button>
</c:forEach>
</h3>

<table frame="box" width="200">
	<tr>
		<th>Answers</th>
	</tr>
	<c:forEach items ="${answerList}" var="answer" >
	<tr>
		<td>${answer.answer}</td>
	</tr>
	</c:forEach>
</table>

<form:form method="POST" action="/${question.id}/addAnswer" modelAttribute="newAnswer">
    	<p><form:label path="answer">Add your answer:</p>
    <p><form:errors path="answer"/></p>
    <p> Answer: <form:input path="answer" style="width:130px; height:50px"/>
    </form:label></p>

    <input type="submit" value="Answer it!"/>
</form:form>

</div>

</body>
</html>