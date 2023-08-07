<%@page import="model_i.ImageDTO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% int i = 0;
for(ImageDTO dto : (ArrayList<ImageDTO>) request.getAttribute("mainData")) { %>
	<div style="border:1px solid #ccc;  float:left;">
		<a href="GDetail?id=<%=dto.getId()%>">
		<img style="width:180px; height:180px;" src="/mvcProj/upload/<%=dto.getUpfile()%>" alt="">
		</a>
		<hr>
		<p>제목: <%=dto.getTitle() %></p>
		<p>내용: <%=dto.getContent() %></p>
		
	</div>
<%} %>
<div>
	<a href="GWriteForm">이미지 등록</a>	
</div>
