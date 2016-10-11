<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Iutf-8">
	<link rel="stylesheet" href="css/style.css">
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
	<div class ='wrapper'>
				<div id ='header'> 
					<h1>Danh sách các sinh viên của trường Nguyễn Tất Thành</h1>
				</div>	
				<%@ include file="/fragment/_menu.jsp"%>	
				<div id ='content' >
					<form name = "myForm" method = "POST" action ="findStudent"
						onsubmit="return validateForm()">
						<br>Nhập MSSV
					  	<input type="number" name = "mssv"/>
					  	<br><br>
					  	 <input type="submit" value ="Tìm Kiếm"/>
				  </form>
				  <table>
						<tr>
							<th>MSSV</th>
							<th>Họ tên</th>
							<th>Mã Lớp</th>
							<th>Liên hệ</th>
						</tr>
							<tr>
								<td>${student.mssv}</td>
								<td>${student.name}</td>
								<td>${student.className}</td>
								<td>${student.address}</td>
							 </tr>
					</table>
				</div>	
	</div>
		<%@ include file="/fragment/_footer.html"%>	
</body>
</html>