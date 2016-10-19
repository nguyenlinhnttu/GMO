<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mybatis Config XML</title>
</head>
<body>

						 <c:forEach items="${message}" var="SList" >
						<tr>
							<td>${SList.mssv}</td>
							<td>${SList.fullName}</td>
							<td>${SList.className}</td>
							<td>${SList.email}</td>
						 </tr> </br>
						 </c:forEach>
</body>
</html>