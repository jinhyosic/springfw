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
	<h1>책 목록</h1>
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
			<c:if test="${fn:length(customerList)==0}">
				<tr>
					<td colspan="5">List 값 없음</td>
				</tr>
			</c:if>
			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.author}</td>
					<td>${customer.genre}</td>
					<td>${customer.isbn}</td>
					<td>${customer.created_at }</td>
					<td><a href="./getCustomer.do?id=${customer.id }">${customer.title}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>