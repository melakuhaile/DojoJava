<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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


<form action="/languages/new" method="POST" modelAttribute="language">
  Name:<br>
  <input type="text" name="name">
  <br>
  Creator:<br>
  <input type="text" name="creator">
  <br>
  Version:<br>
  <input type="text" name="version">
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 