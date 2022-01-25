<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 메인 홈 </title>
</head>
<body>
		<c:if test="${sessionScope.memberId eq null }">
		<h1>로그인 페이지</h1>
		<fieldset>
				<legend>로그인</legend>
				<form action="/member/login" method="post">
						ID :   <input type="text" name="member-id"><br>
						PW : <input type="password" name="member-pwd"><br>
						<input type="submit" value="로그인">
						<input type="reset" value="취소">
						<a href="/enrollView">회원가입</a>
				</form>
		</fieldset>
		</c:if>
		<c:if test="${sessionScope.memberId ne null }">
			${sessionScope.memberId } 님 환영합니다.
			<a href="/member/logout">로그아웃</a><br>
			<a href="/member/myInfo?memberId=${sessionScope.memberId }">마이페이지</a><br> <!-- 쿼리문으로 조회할 내 아이디를 보낸다. -->
			<a href="/notice/write">공지사항 등록</a><br>
		</c:if>
</body>
</html>