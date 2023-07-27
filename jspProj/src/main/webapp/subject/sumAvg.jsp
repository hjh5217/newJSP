<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국영수 점수 계산하기</title>
</head>
<body>
	<h1 align="center">점수계산기</h1>
	<form action="avgProcess.jsp">
		<table border="" align="center">
			<tr>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
			<% for(int i=0; i<5;i++){ %>
			<tr>
				<td><input type="text" name="name"></td>
				<td><input type="text" name="kor"></td>
				<td><input type="text" name="eng"></td>
				<td><input type="text" name="math"></td>
			</tr>
			<%} %>
			<tr>
				<td colspan="4" align="center">
					<input type="submit" value="계산"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>