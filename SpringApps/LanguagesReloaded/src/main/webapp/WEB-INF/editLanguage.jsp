<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" action="/languages/edit/${id}" modelAttribute="language" varStatus="loop">
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label><br>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label><br>
    
    <form:label path="currentVersion">Current Version
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion"/></form:label><br>
   <a href="/languages/delete/${loop.index}">Delete</a>
    <input type="submit" value="Submit"/>
</form:form>

