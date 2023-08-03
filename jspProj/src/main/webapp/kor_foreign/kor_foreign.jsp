<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내/외국인 판별</title>
</head>
<body>
<h2>주민번호 입력해주세요</h2>
<form action="process.jsp" method="post">
	이름 입력 : <input type="text" name="name"/><br/>
	주민번호 입력 : <input type="text" name="birth"/> -
	<input type="text" name="check"/>
	<button type="submit">확인</button>
</form>
</body>
</html>