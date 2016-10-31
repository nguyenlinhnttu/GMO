<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<link href="/resources/css/styles.css" type="text/css" rel="stylesheet">
	<title>Add new Student</title>
</head>
<body>
	<script>
		function validateForm() {
		    var x = document.forms["formUpdate"]["averageScore"].value;
		    if (x == null || x == "") {
		        alert("Chưa nhập giá trị cần tìm!");
		        return false;
		    }
		}
	</script>
	<div class='wrapper'>
		<div id='header'>
			<h1>UPDATE STUDENT</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<p>${message}</p>
		<div id='contentadd'>
			<form id ="formUpdate" method="POST" action="updateinfostudent">
				StudentID
				<input type="number" name="studentID" readonly="readonly" value="${studentID}"/><br/>
				Address
				<input type="text" name="address" value="${student.address}" required/><br/>
				AverageScore
				<input type="number" step="0.01" name="averageScore" value="${student.averageScore}" required/><br/>
				DateOfBirth
				<input type="date" name="dateOfBirth" value="${student.dateOfBirth}"  required /><br/>
				<input type="submit" value="Update Student">
			</form>
			<br/>
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
