<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<h1>Seach Student by StudentCode</h1>
		</div>
		<%@ include file="/resources/fragment/_menu.jsp"%>
		<div id='content'>
			<form name="myForm" method="POST" action="findStudentByCode"
				onsubmit="return validateForm()">
				<br>Input StudentCode <input type="text" name="studentCode" />
				<br>
				<br> <input type="submit" value="Search" />
			</form>
			<table>
				<tr>
					<th>ID</th>
					<th>Full Name</th>
					<th>StudentCode</th>
					<th></th>
				</tr>
				<c:forEach items="${listStudent}" var="SList">
					<tr>
						<td>${student.studentID}</td>
						<td>${student.studentName}</td>
						<td>${student.studentCode}</td>
						<td><a href="viewdetail">Chi tiết</a> <a href="updatestudent">Cập
								nhật</a> <a href="deletestudent?studentID=${student.studentID}">Xóa</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<%@ include file="/resources/fragment/_footer.html"%>
</body>
</html>