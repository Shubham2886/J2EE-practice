
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1>All users are:</h1>

<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/sales" user="root" password="root" var="ds"></sql:setDataSource>

<sql:query dataSource="${ds}" var="rs">select * from orders;</sql:query>
<div class="container">
<table class="table">
<tr>
	<td>Order Number</td>
	<td>Order Date</td>
	<td>Customer Id</td>
</tr>

<c:forEach items="${rs.rows}" var="row">
<tr>
	<td><c:out value="${row.ord_no}"></c:out></td>
	<td><c:out value="${row.ord_date}"></c:out></td>
	<td><c:out value="${row.cust_id}"></c:out></td>

</tr>

</c:forEach>

</table>
</div>


</body>
</html>