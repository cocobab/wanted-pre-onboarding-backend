<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<%
request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채용공고 목록</title>
</head>
<body>
	<c:choose>
		<c:when test="${list == null || list.isEmpty()}">
			<table align="center" border="3" width="100%">
				<tr height="10">
					<td><span style="font-size: 9pt">등록된 글이 없습니다.</span></td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<c:forEach var="notice" items="${list}">
				<form style="display: flex;"action="${contextPath }/detail" method="post">
					<table align="center" border="3" width="100%"
						onclick="fn_moveDetail(${notice.noticeId})">
						<tr>
							<td>채용공고_id:</td>
							<td><input name="noticeId" value="${notice.noticeId }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>회사명:</td>
							<td><input name="companyName" value="${notice.companyName }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>국가:</td>
							<td><input name="companyCountry" value="${notice.companyCountry }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>지역:</td>
							<td><input name="companyLocal" value="${notice.companyLocal }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>채용포지션:</td>
							<td><input name="pos" value="${notice.pos }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>채용보상금:</td>
							<td><input name="money" value="${notice.money }" style="width:99.5%; font-size:110%;"></td>
						</tr>
						<tr>
							<td>사용기술:</td>
							<td><input name="skill" value="${notice.skill }" style="width:99.5%; font-size:110%;"></td>
						</tr>
					</table>
					<input type="submit" value="채용공고 상세보기">
				</form>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	<a href="${contextPath }/main">메인화면으로 돌아가기</a>
</body>
</html>