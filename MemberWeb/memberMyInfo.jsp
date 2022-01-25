<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 폼태그를 이용해서 서블릿에 요청할 때 데이터도 같이 보내줘야하는데 그 때 인풋 태그에 name 속성을 반드시 적어주어야 합니다. -->
	<form action="/member/update" method="post">
		<fieldset>
			<legend>회원 상세 정보</legend>
			<ul>
				<!-- member 객체에서 getter 이용해서 데이터 가져왔어요 -->
				<!-- input 태그를 페이지에 작성함으로써 디비에서 가져온 데이터를 수정할 수 있게 했어요 -->
				<li>아이디 : <input type="text" value="${requestScope.member.memberId }" name="member-id" readonly></li>
				<li>비밀번호 : <input type="password" value="" name="member-pwd"></li>
				<li>이름 : <input type="text" value="${member.memberName }" readonly></li>
				<li>성별 : ${member.memberGender}</li>
				<li>이메일 : <input type="text" value="${member.memberEmail }" name="member-email"></li>
				<li>폰번호 : <input type="text" value="${member.memberPhone }" name="member-phone"></li>
				<li>주소 : <input type="text" value="${member.memberAddress }" name="member-address"></li>
				<li>취미 : <input type="text" value="${member.memberHobby }" name="member-hobby"></li><br>
				<input type="submit" value="수정하기">
				<input type="button" value="취소">
			</ul>
		</fieldset>
	</form>
	<br>
	<a href="/index.jsp">메인페이지로 이동</a>
	<a href="/member/delete?memberId=${member.memberId }">회원 탈퇴하기</a> <!-- ?뒤에 있는 memberId는 request.getParameter에 전달값으로 사용 -->
</body>
</html>