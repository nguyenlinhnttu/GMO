<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					<tr>
						<td>${student.studentID}</td>
						<td>${student.address}</td>
						<td>${student.averageScore}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy" value="${student.dateOfBirth}" /></td>
					</tr>
			</table>
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
