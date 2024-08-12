<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
request.setCharacterEncoding("utf-8");
%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채용공고 작성</title>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<body>
	<c:choose>
		<c:when test="${detail != null}">
			<form name="modForm" action="${contextPath}/modNotice" method="post">
		</c:when>
		<c:otherwise>
			<form name="addForm" action="${contextPath}/addNotice" method="post">
		</c:otherwise>
	</c:choose>
	<table border="0" align="center">
		<tr>
			<td align="right">회사id</td>
			<c:choose>
				<c:when test="${detail != null}">
					<td><input name="companyId" value="${detail.companyId}"
						size="20" maxlength="100" readonly="readonly"></td>
				</c:when>
				<c:otherwise>
					<td><input name="companyId" type="text" size="20"
						maxlength="100" required="required"></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td align="right">채용포지션:</td>
			<c:choose>
				<c:when test="${detail != null}">
					<td><input name="pos" value="${detail.pos}" size="67"
						maxlength="500" required="required"></td>
				</c:when>
				<c:otherwise>
					<td><input name="pos" type="text" size="67" maxlength="500"
						required="required"></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>채용보상금:</td>
			<c:choose>
				<c:when test="${detail != null}">
					<td><input name="money" value="${detail.money}"
						required="required"></td>
				</c:when>
				<c:otherwise>
					<td><input name="money" type="text" required="required"></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td align="right" valign="top">채용내용:</td>
			<c:choose>
				<c:when test="${detail != null}">
					<td><textarea name="contents" rows="10" cols="69"
							maxlength="4000" required="required">${detail.contents}</textarea></td>
				</c:when>
				<c:otherwise>
					<td><textarea name="contents" rows="10" cols="69"
							maxlength="4000" required="required"></textarea></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>사용기술:</td>
			<c:choose>
				<c:when test="${detail != null}">
					<td><input name="skill" value="${detail.skill}"
						required="required"> <!-- noticeId를 controller로 넘겨주기 위한 tag -->
						<input name="noticeId" value="${detail.noticeId }" type="hidden">
					</td>
				</c:when>
				<c:otherwise>
					<td><input name="skill" type="text" required="required"></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td align="right"></td>
			<c:choose>
				<c:when test="${detail != null}">
					<td colspan="2"><input type="submit" value="채용공고 수정">
						<a href="${contextPath}/detail?noticeId=${detail.noticeId}">채용공고
							상세페이지로 돌아가기</a></td>
				</c:when>
				<c:otherwise>
					<td colspan="2"><input type="submit" value="채용공고 작성">
						<a href="${contextPath}/main">메인화면으로 돌아가기</a></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</table>
	</form>
</body>
</html>
