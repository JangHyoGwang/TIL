<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<body>
	<h2>제목 : ${notice.noticeSubject }</h2>
	<h6>글번호 : ${notice.noticeNo } / 글쓴이 : ${notice.noticeUserId } / 작성일 : ${notice.noticeDate } </h6>
	<h3>글내용</h3>
	<div>${notice.noticeContents }</div><br><br>
	<a href="/notice/modify?noticeNo=${notice.noticeNo }">수정</a>
	<a href="/notice/list">목록</a>
	<a href="/notice/delete?noticeNo=${notice.noticeNo }">삭제</a>
	<%-- <form action="/notice/delete" method="get">
		<input type="hidden" name="noticeNo" value=${notice.noticeNo }>
		<input type="submit" value="삭제">
	</form> --%>
</body>
</html>
