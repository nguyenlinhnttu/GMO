<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<html>
<head>
	<link  href="/resources/css/styles.css" type="text/css" rel="stylesheet" >
	<title>List Student</title>
</head>
<body>
	<div class='wrapper'>	
		<div id='header'>
			<h1>LIST STUDENT</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='content'>
		${message}
			<table id ="studentstable">
				<tr>
					<th>ID</th>
					<th>Full Name</th>
					<th>StudentCode</th>
					<th>Address</th>
					<th>AvarageScore</th>
					<th>DateOfBirth</th>
					<th>Option</th>
				</tr>
				<c:forEach items="${listStudent}" var="SList">
					<tr>
						<td>${SList.studentID}</td>
						<td>${SList.studentName}</td>
						<td>${SList.studentCode}</td>
						<td>${SList.studentInfo.address}</td>
						<td>${SList.studentInfo.averageScore}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy" value="${SList.studentInfo.dateOfBirth}" /></td>
						<td>
							<a href="update?studentID=${SList.studentID}">Cập nhật</a> 
							<a href="deletestudent?studentID=${SList.studentID}">Xóa</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="page">
			<p>Total :${count} row </p>
			<ul id="pagination-flickr">
				<%
				  int totalRecord = (Integer) request.getAttribute("count");
				  int pages = totalRecord/10;
				  if ( (totalRecord % 10) > 0){
					  pages = pages +1;
				  }
				  int i;
			      for (i = 1; i < pages + 1; i++) {
			  	%>	
			        <li><a href="page?number=<%=i%>"><%=i%></a></li>
			  	<%
			      }
 				%>
			</ul>
			</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
