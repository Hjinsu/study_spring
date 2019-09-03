<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>전체 목록</h1>

	<table border="1">
		<c:choose>
			<c:when test="${empty list }">
				<col width="800"/>
				<tr>
					<td>고객 정보가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<col width="300"/>
				<col width="500"/>
				<tr>
					<th>ID</th>
					<th>NAME</th>
				</tr>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td><a href="select.do">${dto.id }</a></td>
						<td>${dto.name }</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="2">
						<input type="button" value="고객 추가" onclick="location.href='insertform.do'" />
					</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>

</body>
</html>