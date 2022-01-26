<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<fieldset>
		<legend>회원가입</legend>
		<form action="/insertMember.kh" method="post">
			ID : <input type="text" name="member-id"><br>
			PW : <input type="password" name="member-pwd"><br>
			<input type="submit" value="가입">
			<input type="reset" value="취소">
		</form>
	</fieldset>
</body>
</html>
