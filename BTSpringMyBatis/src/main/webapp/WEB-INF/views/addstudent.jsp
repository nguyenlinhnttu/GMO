<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<link rel="stylesheet" href="resources/css/styles.css">
	<title>Add new Student</title>
</head>
<body>
	<div class='wrapper'>
		<div id='header'>
			<h1>ADD NEW STUDENT</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='contentadd'>
			<form method="POST" action="addstudent">
				<p>${message}</p>
				Fullname<br /> <input type="text" name="studentName" required/><br />
				Student Code<br /> <input type="text" name="studentCode" required/><br />
				<br /> <input type="submit" value="Add New Student">
			</form>
			<br />
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>
