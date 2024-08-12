<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<%
request.setCharacterEncoding("utf-8");
response.setContentType("text/html; charset=UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채용공고 상세창</title>
</head>
<body>
	<c:choose>
		<c:when test="${detail == null }">
			<table align="center" border="3" width="100%">
				<tr height="10">
					<td><span style="font-size: 9pt">등록된 채용공고가 없습니다.</span></td>
				</tr>
			</table>
		</c:when>
		
		<c:otherwise>
			<table align="center" border="3" width="100%">
				<tr>
					<td>채용공고_id:</td>
					<td>${detail.noticeId }</td>
				</tr>
				<tr>
					<td>회사명:</td>
					<td>${detail.companyName }</td>
				</tr>
				<tr>
					<td>국가:</td>
					<td>${detail.companyCountry }</td>
				</tr>
				<tr>
					<td>지역:</td>
					<td>${detail.companyLocal }</td>
				</tr>
				<tr>
					<td>채용포지션:</td>
					<td>${detail.pos }</td>
				</tr>
				<tr>
					<td>채용보상금:</td>
					<td>${detail.money }</td>
				</tr>
				<tr>
					<td>사용기술:</td>
					<td>${detail.skill }</td>
				</tr>
				<tr>
					<td>채용내용:</td>
					<td>${detail.contents }</td>
				</tr>
			</table>
		</c:otherwise>
	</c:choose>
	<a href="${contextPath }/list">채용공고 목록으로 돌아가기</a>
	<a href="${contextPath }/delete?noticeId=${detail.noticeId }">삭제하기</a>
	<a href="${contextPath }/modForm?noticeId=${detail.noticeId}">수정하기</a>
</body>
</html>