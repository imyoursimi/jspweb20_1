<%@page import="customer.dao.NoticeDao"%>
<%@page import="customer.vo.Notice"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>noticeEditProc.jsp</h3>
<%
Notice n=(Notice)request.getAttribute("n");
	

	//디테일로 보내기
	response.sendRedirect("noticeDetail.do?c="+n.getSeq());
%>
</body>
</html>