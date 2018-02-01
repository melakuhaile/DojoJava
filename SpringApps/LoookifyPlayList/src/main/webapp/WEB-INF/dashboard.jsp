<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div align="center">
<a href="/songs/new">Add New Song</a>
<a href="/songs/top">Top Songs</a>

<form method="GET" action="/search">
	<input type="text" name="search" value="">
	<input type="submit" name="submit" value="Search">
</form>

<table>
	<tr>
		<th>Name</th>
		<th>Title</th>
		<th>Rating</th>	
		<th> Action </th>
	</tr>
 <c:forEach items="${allplaylist}" var="playlist" varStatus="loop">	
	<tr>
		<td>	
		<a href="/songs/${playlist.id}">${playlist.artistName}</a>
		</td>
		
		<td>	
		<a href="/songs/${playlist.id}">${playlist.artistTitle}</a>
		</td>
		
		<td>
		<c:out value="${playlist.rating}"></c:out>
		</td>
		<td>
		<a href="/delete/${playlist.id}"> Delete </a> 
		</td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>