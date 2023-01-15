<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OOPS!! Something went wrong</title>

<style type="text/css">
*{
padding: 0px;
margin: 0px;
}

</style>
</head>
<body>
<div style="padding: 20px;color: blue;background: aqua;">
<h1>OOPS!! Something went wrong</h1>
<br>
<p><%=exception %></p>
</div>
</body>
</html>