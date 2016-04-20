<%@page import="com.secondaryMarket.factory.ConnectionFactory"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = new ConnectionFactory().createMySqlConnectionBuilder().getConnection();
		Statement stmt = conn.createStatement();
		/*
		--------------+-------------+------+-----+---------+----------------+
		| userId       | int(11)     | NO   | PRI | NULL    | auto_increment |
		| userNackName | varchar(30) | NO   | MUL | NULL    |                |
		| userPassword | varchar(30) | NO   |     | NULL    |                |
		| userRealName | varchar(30) | YES  |     | NULL    |                |
		| userTel      | varchar(20) | YES  |     | NULL    |                |
		| userQQ       | varchar(20) | YES  |     | NULL    |                |
		| userEmail    | varchar(20) | YES  |     | NULL    |                |
		| userSchool   | varchar(30) | YES  |     | NULL    |                |
		| userRole     | int(11)
		*/
		String sql = "insert into user values(null, 'diamond', 'luo', '罗亚飞', '12345', '636363636', '123@foxmail.com', '西安科技大学', 1)";
		stmt.executeUpdate(sql);
		
		out.println("成功！");
	%>
</body>
</html>