<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<html>
<head>
	<link rel="stylesheet" href="resources/css/styles.css">
	<title>Student info</title>
</head>
<body>
	<div class='wrapper'>
		<div id='header'>
			<h1>STUDENT INFO</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='content'>
			<table>
				<tr>
					<th>ID</th>
					<th>Address</th>
					<th>AverageScore</th>
					<th>DateofBirth</th>
				</tr>
				<c:forEach items="${listStudent}" var="listInfo">
					<tr>
						<td>${listInfo.studentID}</td>
						<td>${listInfo.address}</td>
						<td>${listInfo.averageScore}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy" value="${listInfo.dateOfBirth}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
