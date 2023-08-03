<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//칸수지정 count 기본값 5칸
	int cnt = 5; 
	if(request.getParameter("cnt")!=null){
		cnt = Integer.parseInt(request.getParameter("cnt"));
	}
	
	//테스트 할때마다 입력해야되는게 불편해서 임의의 값 넣어줌
	//점수 랜덤값 넣어주기 위한 랜덤 임포트
	Random rd = new Random(); 
	//현빈~십빈 넣어주기 위한 이름배열
	String [] names = "현빈,원빈,투빈,장희빈,미스터빈,육빈,칠빈,팔빈,구빈,십빈".split(",");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam java to jsp</title>
<script type="text/javascript">
	function cntChange(){
		//form name qwer
		qwer.action="?" // 자기 자신한테 돌아옴
		qwer.submit();
	}

</script>
</head>
<body>
	<h1 align="center">점수계산기</h1>
	<form action="examProcess.jsp" name="qwer">
		<table border="" align="center">
			<!-- 칸수지정 5칸 혹은 10칸 -->
			<tr>
				<td colspan="4" align="right">
					칸 수:
					<select name="cnt" id="" onchange="cntChange()">
						<% for(int i = 5; i<=10; i+=5){ 
							String sel = "";
							if(i==cnt){
								sel = "selected";
							}
						%>
						<option <%=sel %>><%=i %></option>
						<%} %>
					</select>
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
			<!-- 테스트할때 계속 입력해야되서 그냥 이름,숫자 넣어줌 -->
			<!-- 5칸일때 오빈까지 10칸일때 십빈까지 -->
			<!-- "현빈,원빈,투빈,장희빈,미스터빈, 육빈,칠빈,팔빈,구빈,십빈" -->
			<% for(int i=0; i<cnt; i++){ %>
			<tr>
				<td><input type="text" name="names" value=<%=names[i] %>></td>
				<td><input type="text" name="kor" value="<%=rd.nextInt(40,100) %>"></td>
				<td><input type="text" name="eng" value="<%=rd.nextInt(40,100) %>"></td>
				<td><input type="text" name="math" value="<%=rd.nextInt(40,100) %>"></td>
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