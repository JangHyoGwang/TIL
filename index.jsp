<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환영합니다.</title>
</head>
<body>
	<button onclick="location.href='/registerForm.kh'">회원가입</button>&nbsp;&nbsp;
	<button onclick="showMemberList();">회원목록</button>
	<script>
		function showMemberList() {
			location.href="/memberList.kh";
		}
	</script>
</body>
</html>
