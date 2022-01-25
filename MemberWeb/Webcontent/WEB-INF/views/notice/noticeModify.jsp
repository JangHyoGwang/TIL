<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>
	<h1>공지사항 수정</h1>
	<form action="/notice/modify" method="post">
		<input type="text" size="100" name="subject" value="${notice.noticeSubject }"><br><br>
		<textarea rows="30" cols="100" name="contents">${notice.noticeContents }</textarea><br><br>
		<input type="hidden" name="noticeNo" value="${notice.noticeNo }">
		<input type="submit" value="수정완료">
		<input type="reset" value="취소">
	</form>
</body>
</html>
