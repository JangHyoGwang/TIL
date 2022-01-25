<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
	<!-- EL을 이용해서 requestscope 접근하여 사용(setAttribute 데이터를 가져온다) -->
	<h1>공지사항</h1>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
		</tr>
		<!-- ${requestScope.nList }를 사용하기 위해서는 JSTL(for문)을 사용해야 함 -->
		<!-- 사용하기 위해서는 1. WEB-INF > lib 폴더에 jar 파일 넣기 -->
		<!-- 2. jsp에서 taglib (태그 디렉티브) 작성해줘야 함 -->
		<c:forEach items="${requestScope.nList }" var="notice">
			<!-- items에서는 notice 객체를 가지고 있는 리스트를 적어주고 -->
			<!-- forEach를 통해서 리스트의 객체 하나를 var에 있는 notice 변수에 넣어주고 -->
			<!-- notice는 EL을 통해서 사용하되 객체이기 때문에 -> .키워드를 통해서 멤버변수에 접근하여 해당 값들을 꺼내올 수 있게 됨 -->
			<%--${notice.noticeContents }  --%>
			<tr>
				<td>${notice.noticeNo }</td>
				<!-- 내가 선택한 제목에 해당하는 내용을 보고 싶기 떄문에 쿼리스트링으로 같이 보내줘야 함   -->
				<td><a href="/notice/detail?noticeNo=${notice.noticeNo }">${notice.noticeSubject }</a></td>
				<td>${notice.noticeUserId }</td>
				<td>${notice.noticeDate }</td>
			</tr>
		</c:forEach>
		<!-- <tr>
			<td>1</td>
			<td>notice 1</td>
			<td>admin</td>
			<td>22/01/19</td>
		</tr>
		<tr>
			<td>2</td>
			<td>notice 2</td>
			<td>admin</td>
			<td>22/01/19</td>
		</tr>
		<tr>
			<td>3</td>
			<td>notice 3</td>
			<td>admin</td>
			<td>22/01/19</td>
		</tr> -->
		<tr>
			<td colspan="4">
				<form action="/notice/write" method="get">
					<input type="submit" value="글쓰기">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				${pageNavi }
			</td>
		</tr>
	</table>
</body>
</html>