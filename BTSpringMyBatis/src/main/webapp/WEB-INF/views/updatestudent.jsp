<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
	<link rel="stylesheet" href="resources/css/styles.css">
	<title>Add new Student</title>
</head>
<body>
	<div class='wrapper'>
		<div id='header'>
			<h1>UPDATE STUDENT</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='contentadd'>
			<form method="POST" action="updateinfostudent">
				StudentID<input type="number" name="studentID" readonly="readonly" value="${studentID}"/><br/>
				Address<input type="text" name="address" value="${student.address}" required/><br/>
				AverageScore<input type="number" name="averageScore" value="${student.averageScore}" required/><br/>
				DateOfBirth<input type="date" name="dateOfBirth" value="${student.dateOfBirth}"  required /><br/>
				<input type="submit" value="Update Student">
			</form>
			<br />
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
