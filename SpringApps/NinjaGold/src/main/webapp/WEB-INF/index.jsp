
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		
	</head>
	<body>
	
		<h2>Your Gold: <input type="text" value="${score}"></h2>
		
		<fieldset>
			<h2>Farm</h2>
			<p>Earns 10-20 golds</p>
			<form action="/Gold" method="post">
				<input type="hidden" name="activity" value="farm" />
				<input type="submit" value="Find Gold!"/>
			</form>
		</fieldset>
		<fieldset>
			<h2>Cave</h2>
			<p>Earns 5-10 golds</p>
			<form action="/Gold" method="post">
				<input type="hidden" name="activity" value="cave" />
				<input type="submit" value="Find Gold!"/>
			</form>
		</fieldset>
		<fieldset>
			<h2>House</h2>
			<p>Earns 2-5 golds</p>
			<form action="/Gold" method="post">
				<input type="hidden" name="activity" value="house" />
				<input type="submit" value="Find Gold!"/>
			</form>
		</fieldset>
		<fieldset>
			<h2>Casino</h2>
			<p>Earns -50-50 golds</p>
			<form action="/Gold" method="post">
				<input type="hidden" name="activity" value="casino" />
				<input type="submit" value="Find Gold!"/>
			</form>
		</fieldset>
		
		
	        <div class="reset">
			<form action="/Gold" method="post" >
				<input type="hidden" name="activity" value="reset">
				<input type="submit"  value="reset"style="color:red; width:80px;height:70px" />
			</form>
			</div>
		
		
		
		
		<div class="activities">
			<h2>Activity Log:</h2>
			 <div >
					<c:forEach var="row" items="${log}">
						<c:if test="${row.contains('lost')}">
						   <p style="color:red">${row}<p>
						</c:if>
						<c:if test="${!row.contains('lost')}">
						   <p style="color:green">${row}<p>
						</c:if>
					</c:forEach>
		      </div>
		</div>
	</body>
</html>

<style>
fieldset{
display: inline-block;
width: 165px;
height: 150px;
margin-bottom: 10px;
}
.activities {
background-color: #eee;
overflow:scroll;
height: 350px;
width: 800px;
}

</style>
