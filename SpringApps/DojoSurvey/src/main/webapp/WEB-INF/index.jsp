<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: arial;">
	<h2>Dojo Survey</h2>
		<fieldset style="width: 260px;">
			<form method="POST" action="/home">
				<input type="text" name="name" placeholder="Name">
				<br>
				<br>Dojo Location: <br>
				<select name="location">
					<option>DC</option>
					<option>LA</option>
					<option>NY</option>
					<option>WA</option>
				</select><br>
				Favorite Language: <br>
				<select name="langauge">
					<option>Java</option>
					<option>Python</option>
					<option>C#</option>
					<option>MEAN</option>
				</select><br>
				<br>
				<textarea name="comment" style="width: 250px; height:50px;"placeholder="Comment... (optional)"></textarea>
				
				<br>
				
				<input type="submit" value="Submit">
			</form>
		</fieldset>

</body>
</html>