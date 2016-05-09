<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../res/bootstrap.css">
</head>
<body>
	<table class="table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>姓名</th>
				<th>性别</th>
				<th>地址</th>
				<th>电话</th>
				<th>QQ</th>
				<th>年龄</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.name }</td>
				<td>${user.sex }</td>
				<td>${user.address }</td>
				<td>${user.tel }</td>
				<td>${user.qq }</td>
				<td>${user.age }</td>
			</tr>
		</tbody>		
	</table>
</body>
</html>