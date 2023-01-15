<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
*{
background-color: orange;

}

</style>
<title>Insert title here</title>
</head>
<body>
<h1>This is JSTL EXAMPLE</h1>
<hr>
<!-- 1 out tag = alternative for expression tag -->


<!-- 2 set tag = use to create variable-->

<c:set var="i" value="0" scope="application"></c:set>

<h1> <c:out value="${i}"></c:out> </h1>

<hr>


<!--4 if tag = for condition checking  -->


<c:if test="${i==23}">
<h1>i is 23 and the condition is true</h1>


</c:if>

<hr>

<!--5 choose,when and otherwise = works as java switch  -->

<c:choose>
	<c:when test="${i>0}">
		<h1>This is case first</h1>
		<h2>Number is Positive</h2>
	</c:when>

<c:when test="${i<0}">
		<h1>This is case Second</h1>
		<h1>Number is Negative</h1>
</c:when>
	<c:otherwise>
		<h1>Default case.. otherwise</h1>
		<h1>The Number is Zero</h1>
	</c:otherwise>
</c:choose>

<!-- 6 foreach -->

<c:forEach var="j" begin="1" end="10" >
<h1>value of j is <c:out value="${j*2}"></c:out>  </h1>

</c:forEach>

<!-- 7 Redirect -->


<c:url var="myurl" value="www.goole.com/search">
	<c:param name="q" value=""></c:param>


</c:url>
<h2><c:out value="${myurl}"></c:out></h2>
</body>
</html>