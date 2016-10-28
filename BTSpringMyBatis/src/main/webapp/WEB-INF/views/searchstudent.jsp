<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Iutf-8" />
	<link rel="stylesheet" href="resources/css/styles.css" />
	<title>Tìm kiếm</title>
<script>
function validateForm() {
    var x = document.forms["myForm"]["mssv"].value;
    if (x == null || x == "") {
        alert("Chưa nhập giá trị cần tìm!");
        return false;
    }
}
</script>
</head>
<body>
	<div class='wrapper'>
		<div id='header'>
			<h1>SEARCH STUDENT </h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='content'>
			<div id='formsearch'>
				<form name="myForm" method="POST" action="searchstudents"
					onsubmit="return validateForm()">
					Input StudentCode 
					<input type="text" name="studentCode"/>
					<br>
					<br> <input type="submit" value="Search" />
				</form>
			</div>
			<p>${message}</p>
			<table>
				<tr>
					<th>ID</th>
					<th>Full Name</th>
					<th>StudentCode</th>
					<th>Address</th>
					<th>AvarageScore</th>
					<th>DateOfBirth</th>
				</tr>
					<tr>
						<td>${student.studentID}</td>
						<td>${student.studentName}</td>
						<td>${student.studentCode}</td>
						<td>${student.studentInfo.address}</td>
						<td>${student.studentInfo.averageScore}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy" value="${student.studentInfo.dateOfBirth}" /></td>
					</tr>
			</table>
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>