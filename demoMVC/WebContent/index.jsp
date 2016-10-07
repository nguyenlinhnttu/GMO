<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
	<link rel="stylesheet" href="css/style.css">
	<title>Danh sách sinh viên</title>
	</head>
		<body>
			<div class ='wrapper'>
				<div id ='header'> 
					<h1>Danh sách các sinh viên của trường Nguyễn Tất Thành</h1>
				</div>	
				<%@ include file="/fragment/_menu.jsp"%>	
				<div id ='content'>
					<table>
						<tr>
							<th>MSSV</th>
							<th>Họ tên</th>
							<th>Mã Lớp</th>
							<th>Liên hệ</th>
						</tr>
						 <c:forEach items="${sinhVienList}" var="sv" >
						<tr>
							<td>${sv.mssv}</td>
							<td>${sv.name}</td>
							<td>${sv.className}</td>
							<td>${sv.address}</td>
						 </tr>
						 </c:forEach>
					</table>
				</div>	
			</div>
			<%@ include file="/fragment/_footer.html"%>	
		</body>
</html> 