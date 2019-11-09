<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="text-align: center;">
		<caption>用户信息</caption>
		<tr>    
			<td>用户名</td>
			<td>删除</td>
		</tr>
		<c:forEach items="${usersList}" var="user">
			<tr>
				<td>${user.uname}</td>
				<td><a href="/users/delete">删除</a></td>
			</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>