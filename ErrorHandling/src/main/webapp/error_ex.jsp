<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Sorry!! Something Went Wrong</title>
</head>
<body>

<div class="container p-3 text-centre" >
	<img alt="" src="img/Error.jfif" class="img-fluid"/>
<h1 class="display-3]">Sorry!! Something Went Wrong</h1>
<p><%= exception %></p>
<a class="btn-outline-primary" href="Index.html">Home Page</a>

</div>


</body>
</html>