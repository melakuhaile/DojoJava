<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<table class="table">

<tr>
<td>id</td><td>Name</td><td>Creator</td>
<td>Version</td><td>action</td>
</tr>
<c:forEach var="lang" items="${languages}" varStatus="loop" >
    <tr>    
    <td>${lang.id}</td>
    <td>
    		<a href="/languages/${lang.id}">${lang.name}</a>
    </td>
    <td>${lang.creator}</td>
    <td>${lang.cver}</td>
    <td>
    		<a href="/languages/delete/${lang.id}">delete</a>
    		<a href="/languages/update/${lang.id}">edit</a>
    </td>
    </tr>
</c:forEach>
</table>

<h2>Add new record</h2>
 <form:form method="POST" action="/languages/new" modelAttribute="lang">
 	<form:hidden path="id"/>
 	
    <form:label path="name">name
    <form:input path="name"/></form:label>
    <span style="color:red"><form:errors path="name"/></span>
    <br/>
    
    <form:label path="creator">Creator
    <form:input path="creator"/></form:label>
    <span style="color:red"><form:errors path="creator"/></span>
    <br/>
    
    <form:label path="cver">Current version
    <form:input path="cver"/></form:label>
    <span style="color:red"><form:errors path="cver"/></span>
    <br/>
    
    
    <input type="submit" value="Submit"/>
</form:form>



<style>
table.table {
	width:100%;
}
</style>