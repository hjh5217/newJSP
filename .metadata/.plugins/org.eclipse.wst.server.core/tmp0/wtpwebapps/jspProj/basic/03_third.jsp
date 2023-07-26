<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_third</title>
</head>
<body>
<h1>03_third</h1>
<%!
	//declaration 클래스 정의부
	//멤버변수
	String name = "나는무너";
	int age = 49;
	boolean marriage = true;
	
	void math_1(){
		System.out.println("math_1() 실행");
	}
	//System.out.println("정의부에서 실행구문 불가");
	
	public void jspInit(){
		System.out.println("jspInit() 실행");
	}
	public void jspDestroy(){
		System.out.println("jspDestroy() 실행");
	}
%>
<%!
	//int age = 23; 멤버변수 중첩
	int [] arr = {11,22,33,44,55};
%>
<% 	
	//scriptlet : _jspService() 
	// %! 정의부의 age 는 멤버변수
	// % 실행부의 age 는 지역변수
	// 지역변수는 멤버변수와 중첩 가능
	System.out.println("scriptlet 실행"+age);
	int age = 23;
	System.out.println("scriptlet 실행"+age);
	// int age = 17; 지역변수 중첩불가. 
	
	String str = "무너";
	//바꾸고 저장하면 다시 뿌려줘야하니까 destroy 이후 다시 init
	
	out.println("str:"+str);
	
	//메소드 정의 불가
	/* void math_1(){
		System.out.println("math_1() 실행");
	} */
%>
<%= age %>
</body>
</html>


