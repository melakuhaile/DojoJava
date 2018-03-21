<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ... -->
<div>
<p>Name: <c:out value="${language.name}"/></p>
<p>creator: <c:out value="${language.creator}"/></p>
<p>current ver: <c:out value="${language.currentVersion}"/></p><br>
<a href="/languages/delete/${loop.index}">Delete</a>
<a href="/languages/edit/${loop.index}">Edit</a>
</div>