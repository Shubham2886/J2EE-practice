<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/myLib" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp page</title>
</head>
<body>
<h1>Hello</h1>
<t:MyTag></t:MyTag>


<t:prinTTable number="36"></t:prinTTable>


<%
out.println();
request.getParameter("");
response.sendRedirect("");

//config.(config)
//session

//out.println(session.isNew());


%>
</body>
</html>