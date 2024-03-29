<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.stream.Collector"%>
<%@page import="java.util.ArrayList"%>
<%@page import="subject.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산페이지</title>
</head>
<body>
<%
// 전 페이지에 입력된 값으로 person 을 만들어서 personList에 넣어줌
List<Person> personList = new ArrayList<>();

String[] name = request.getParameterValues("name");
String[] kor  = request.getParameterValues("kor");
String[] eng = request.getParameterValues("eng");
String[] math = request.getParameterValues("math");

for(int i=0; i<5; i++){ 
	String nameOne = name[i];
	int korInt = Integer.parseInt(kor[i]);
	int engInt = Integer.parseInt(eng[i]);
	int mathInt = Integer.parseInt(math[i]);
	int sum = korInt+engInt+mathInt;
	int avg = sum/3;	
	
	personList.add(new Person(nameOne, korInt, engInt, mathInt, sum, avg));
}
%>
<%
	//순위 구하기
	for(int i=0; i<5; i++){
		int rank = 1;
		for(int j=0; j<5; j++){
			int avgComparei = personList.get(i).getAvg();
			int avgComparej = personList.get(j).getAvg();
			if(avgComparei < avgComparej){
				rank++;
			}	
		}
		personList.get(i).setRank(rank);
	}
%>
<h1 align="center">결과</h1>
<table border="" align="center">
	<tr>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>총점</th>
		<th>평균</th>
	</tr>
	<% // 정보 뿌려주기
	Collections.sort(personList, new Comparator<Person>(){
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getRank() - p2.getRank();
        }
    });
	
	for(int i=0; i<personList.size(); i++){%>
	<tr>
		<td><input type="text" value="<%=personList.get(i).getName()%>" disabled="disabled"></td>
		<td><input type="text" value="<%=personList.get(i).getKor()%>" disabled="disabled"></td>
		<td><input type="text" value="<%=personList.get(i).getEng()%>" disabled="disabled"></td>
		<td><input type="text" value="<%=personList.get(i).getMath()%>" disabled="disabled"></td>
		<td><input type="text" value="<%=personList.get(i).getSum() %>" disabled="disabled"></td>
		<td><input type="text" value="<%=personList.get(i).getAvg() %>" disabled="disabled"></td>
	</tr>
	<%} %>
</table>
</body>
</html>