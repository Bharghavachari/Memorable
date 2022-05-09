<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>

	<header style="color: navy; margin: 0%; text-align: center">

		<h1>Welcome to Newspaper</h1>
		<hr>
	</header>

	<pre>
	<form action="news.abc">
	
	Name :<input type="text" name="NewspaperName"><br>
	Price: <input type="text" name="Price"><br>
	Language : <input type="text" name="Language"><br>
	No_of_Pages :<input type="text" ' name="NoOfPages"><br>
	
	<input type="Submit" value="Save" style="color: red;">
	
	</form>

</pre>

<form action="searchNewspaper.abc"></form>
<label>SearchNesPaper</label>
<input type ="text" name = "searchNewspaper">
<input type = "submit" value= "searchNewspaper" style = color: red>


</body>
</html>