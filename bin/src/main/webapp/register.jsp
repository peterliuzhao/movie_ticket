<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>注册界面</h3>
	<form action="/users/save">
		username:<input type="text" name="uname"><br/>
		password:<input type="text" name="upwd"><br/>
		<button type="submit">注册</button>
	</form>
</body>
</html>