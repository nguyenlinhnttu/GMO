<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<link rel="stylesheet" href="resources/css/styles.css">
	<title>Danh sách sinh viên</title>
</head>
<body>
	<div class='wrapper'>
		<div id='header'>
			<h1>LIST STUDENT</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='content'>
		<p>${message}</p>
			<table>
				<tr>
					<th>ID</th>
					<th>Full Name</th>
					<th>StudentCode</th>
					<th></th>
				</tr>
				<c:forEach items="${listStudent}" var="SList">
					<tr>
						<td>${SList.studentID}</td>
						<td>${SList.studentName}</td>
						<td>${SList.studentCode}</td>
						<td><a href="viewdetail?studentID=${SList.studentID}">Chi
								tiết</a> <a href="update?studentID=${SList.studentID}">Cập
								nhật</a> <a href="deletestudent?studentID=${SList.studentID}">Xóa</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<p>${count}</p>
		<div class="page">
			<ul id="pagination-flickr">
				<%
				  int lenght = (Integer) request.getAttribute("count")/10; 
			      for (int i = 0; i < lenght; i++) {
			  	%>
			        <li><a href="page?number=">i</a></li>
			  	<%
			      }
 				%>
			</ul>
			</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
