<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
  
  <%@page errorPage="Error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.bg{
background-image: url("https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero.jpg");

 
}

</style>
</head>
<body class="bg">

<h1>division=

<%!
int a = 200;
int b  = 10;
String s = null;
	
%>

<%
int division =a/b;
%>

<%-- <%=division %> --%>
<%= s.length() %>
</h1>

 <%-- <c:set var="name" value="Sharma" ></c:set>
 
 <c:out value="${name}"></c:out>
 <c:if test="${2>3 }">
	<h1>This is true block</h1> 
 </c:if>
 
 <c:out value="${3496+5 }"></c:out>

 --%>
 
 
 
 </body>
</html>