<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<table border="1">
	<tr align="center">
		<th>EMPNO</th>
		<th>ENAME</th>
		<th>SAL</th>
		<th>DEPTNO</th>
	</tr>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
				<td>다시 짜</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="dto">
				<tr>
					<td>${dto.empno }</td>
					<td>${dto.ename }</td>
					<td>${dto.sal }</td>
					<td>${dto.deptno }</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>
</body>
</html>
