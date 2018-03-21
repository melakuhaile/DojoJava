<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Languages</title>
<p>Languages</p>
<table class="table">
<c:forEach items="${languages}" var="language" varStatus="loop">
	<tr>
		<td>Name: <c:out value="${language.name}"/></td>
		<td>creator: <c:out value="${language.creator}"/></td>
		<td>current ver: <c:out value="${language.currentVersion}"/></td>
		<td><a href="/languages/delete/${loop.index}">Delete</a></td>
		<td><a href="/languages/edit/${loop.index}">Edit</a></td>
	 </tr>
</c:forEach>
</table><br>


<form:form method="POST" action="/languages/new" modelAttribute="language">

    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label><br>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label><br>
    
    <form:label path="currentVersion">Current Version
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion"/></form:label><br>
    
    <input type="submit" value="Submit"/>
</form:form>

