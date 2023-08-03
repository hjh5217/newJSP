<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내/외국인 판별</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	String check = request.getParameter("check");
	
	String birthYear = birth.substring(0,4);
	String birthMonth = birth.substring(4,6);
	String birthDate = birth.substring(6,8);
	
	
	Date now = new Date();
	
	SimpleDateFormat sf = new SimpleDateFormat("yyyy");

	String today = sf.format(now);
	
	int todayInt = Integer.parseInt(today); 
	int birthYearInt = Integer.parseInt(birthYear);
	
	out.println(today);
	out.println(todayInt-birthYearInt);
	
	
	if(check.substring(0,1).equals("5") || check.substring(0,1).equals("6") 
			|| check.substring(0,1).equals("7") || check.substring(0,1).equals("8")){
		response.sendRedirect("signup.jsp");	
	}else{
		if((todayInt-birthYearInt) > 18){
			response.sendRedirect("adult.jsp?"+"name="+name+"&&"+"birth="+birth);	
		}else{
			response.sendRedirect("signup.jsp?"+"name="+name+"&&"+"birth="+birth);	
		}
	}
%>
<h2>내/외국인 판별</h2>
<h2>내/외국인 판별</h2>
<h2>내/외국인 판별</h2>
<h2>내/외국인 판별</h2>
</body>
</html>