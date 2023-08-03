<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내국인/성인</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
%>
<h2>회원가입페이지(내국인/성인)</h2>
이름 : <input type="text" value="<%=name%>"/>
생년월일 : <input type="text" value="<%=birth%>"/>
</body>
</html>