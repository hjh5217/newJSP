<%@page import="examJsp.ExamPerson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examProcess</title>
</head>
<%
	String [] names = request.getParameterValues("names");
	String [] kor = request.getParameterValues("kor");
	String [] eng = request.getParameterValues("eng");
	String [] math = request.getParameterValues("math");
	
	// ExamPerson 을 넣을 배열.
	ExamPerson [] arr = new ExamPerson[names.length];
	
	// 입력부
	for(int i=0; i<arr.length; i++) {
		arr[i] = new ExamPerson(names[i], kor[i], eng[i], math[i]);
		//입력됐는지 체크
		//out.print(arr[i]);
	}
%>
<body>
<h1 align="center">결과</h1>
<table border="" align="center">
	<tr>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>총점</th>
		<th>평균</th>
		<th>등급</th>
		<th>등수</th>
	</tr>
	<!-- 순위 책정 -->
	<%
		for(int i=0; i<arr.length; i++){
			arr[i].rankCalc(arr);
		}
	%>
	
	<!-- 출력부 -->
	<!-- 5칸 배열일때 r(rank) = 1이면 i는 0,1,2,3,4
		 r=1 일때 arr[0] ~ arr[4].getRank()에서 1등이면 arr[i].toString() 출력
		 r=2 일때 arr[0] ~ arr[4].getRank()에서 2등이면 arr[i].toString() 출력
		 r=3 일때 arr[0] ~ arr[4].getRank()에서 3등이면 arr[i].toString() 출력
		 r=4 일때 arr[0] ~ arr[4].getRank()에서 4등이면 arr[i].toString() 출력
		 r=5 일때 arr[0] ~ arr[4].getRank()에서 5등이면 arr[i].toString() 출력
	-->
	<% 
	for(int r=1; r<=arr.length; r++){
		for(int i=0; i<arr.length; i++){
			if(r == arr[i].getRank()){	%>
				<tr>
				<!-- toString 에서 <td><input></td>로 출력되게끔 하였음. -->
					<%=arr[i].toString()%>
				</tr>
	<%} // if
		} // for i
		} // for r
		%>
</table>
</body>
</html>