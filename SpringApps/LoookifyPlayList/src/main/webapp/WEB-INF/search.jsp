<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div align="center">




<form method="GET" action="/search">
	<input type="text" name="search" value="">
	<input type="submit" name="submit" value="Search">
</form>

<button background-color="blue"><a href="/dashboard"> HomePage </a> </button>

<table>
	<tr>
		<th> Name </th>
		
		<th> Title </th>	
		<th> Rating </th>
		<th> Action </th>
	</tr>
 <c:forEach items="${getByArtist}" var="byartist" varStatus="loop">	
	<tr>
		<td>
		<a href="/songs/${byartist.id}">${byartist.artistName}</a>
		</td>
		<td>
		<c:out value="${byartist.artistTitle}"></c:out>
		</td>
		<td>
		<c:out value="${byartist.rating}"></c:out>
		</td>
		<td>
		<a href="/delete/${byartist.id}"> Delete </a> 
		</td>
	</tr>
</c:forEach>
<c:forEach items="${getByTitle}" var="bytitle" varStatus="loop">	
		<tr>
			<td>
			<c:out value ="${bytitle.artistName}"> </c:out>
			</td>
			<td>
			<a href="/songs/${bytitle.id}">${bytitle.artistTitle}</a>
			</td>
			
			<td>
			<c:out value="${bytitle.rating}"></c:out>
			</td>
			<td>
			<a href="/delete/${bytitle.id}"> Delete </a> 
			</td>
	  </tr>
</c:forEach>
</table>

</div>
</body>
</html>























