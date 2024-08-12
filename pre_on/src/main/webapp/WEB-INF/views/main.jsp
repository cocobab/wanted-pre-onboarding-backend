<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<h1>preonBoarding Backend</h1>
	<p>본 서비스는 기업의 채용을 위한 웹서비스입니다.</p>
	<a href="${contextPath }/noticeForm">채용공고 등록</a>
	<a href="${contextPath }/list">채용공고 목록</a>
</body>
</html>