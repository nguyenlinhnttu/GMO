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
					<form method = "POST" action ="addSinhVien">
						${errorMesage}</p><br>
						Nhập MSSV<br>
					  	<input type="text" name = "mssv" value = "${sinhVien.mssv }" /><br>
					  	Nhập Tên<br>
					  	<input type="text" name = "name" value = "${sinhVien.name}"/> <br>
					  	Tên Lớp<br>
					  	<input type="text" name = "className" value = "${sinhVien.className}"/><br>
					  	Địa Chỉ<br>
					 	 <input type="text" name = "address" value = "${sinhVien.address}"/><br><br>
					  	 
					  	 <input type="submit" value="Thêm Sinh Viên">
				  </form>
				</div>	
			</div>
			<%@ include file="/fragment/_footer.html"%>	
		</body>
</html> 