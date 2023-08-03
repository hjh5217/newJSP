<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	
	out.println(name);
	out.println(birth);
%>
<h2>회원가입페이지 / 외국인,미성년자</h2>
이름 : <input type="text" value="<%=name%>"/>
생년월일 : <input type="text" value="<%=birth%>"/>
</body>
</html>