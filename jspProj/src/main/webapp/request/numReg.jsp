<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
<%
	String [] noArr = request.getParameterValues("no");
	int sum = 0;
	for (String str : noArr){
		try{
			if(Integer.parseInt(str)%2 == 0){
				sum += Integer.parseInt(str);
			}
		}catch(Exception e){
			out.println("문제되는 값 : " + str);
		}
	}
%>
<h1>numReg</h1>
no: <%=request.getParameter("no") %> <br/>
noArr:<%= Arrays.toString(noArr) %><br/>
sum:<%=sum %><br/>
</body>
</html>