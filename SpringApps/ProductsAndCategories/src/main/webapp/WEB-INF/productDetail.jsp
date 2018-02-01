<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
<div align="center">
	<div class="header">
		<a href="/">Home</a>
		<h1><c:out value="${product.name}"/></h1>
	</div>
	
	<div class="content">
		<c:out value="${product.name}" />: Desc:
		<c:out value="${product.description}" /> : Price:
		$<c:out value="${product.price}" />  
		<h4>Categories</h4>
		
			<c:forEach items="${product.categories}" var="category">
				<c:out value="${category.name}"/>
			</c:forEach>
		
	</div>
	<div class="subContent">
		<form:form action="/products/${product.id}/add_category" modelAttribute="newCategory" method="POST">
			<form:label path="id">Add Category: 
			<form:errors path="id"/>
			<form:select path="id">
				<c:forEach items="${availCategories}" var="availCategory">
						<form:option value="${availCategory.id}" label="${availCategory.name}"/>
				</c:forEach>
			</form:select></form:label>
			
			<input type="submit" value="Add" />
		</form:form>
	</div>
</div>
</body>
</html>