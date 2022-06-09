<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1><c:out value="${show_books.getTitle()}"/></h1>
	<p><c:out value="${show_books.getDescription()}"/></p>
	<p><c:out value="${show_books.getLanguage()}"/></p>
	<p><c:out value="${show_books.getNumberOfPages()}"/></p>
	
	

</body>
</html>