<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>책 정보</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>author</th>
				<th>genre</th>
				<th>isbn</th>
				<th>title</th>
				<th>created</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>${customerInfo.id }</td>
					<td>${customerInfo.author }</td>
					<td>${customerInfo.genre }</td>
					<td>${customerInfo.isbn }</td>
					<td>${customerInfo.title }</td>
					<td>${customerInfo.created_at }</td>
				</tr>
		</tbody>
	</table>
</body>
</html>