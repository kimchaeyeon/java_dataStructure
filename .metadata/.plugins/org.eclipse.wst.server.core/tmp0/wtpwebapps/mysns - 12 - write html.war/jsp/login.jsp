<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% 
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pass = request.getParameter("pass");

	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "asdf");
	Statement st = conn.createStatement();
	
	String sql = "SELECT id, password FROM user WHERE id = " + id;
	ResultSet rs = st.executeQuery(sql);
	if (!rs.next()) {
		out.print("NA");
	}
	else {
		String dbpass = rs.getString("password");
		if (pass.equals(dbpass) == false) {
			out.print("PS");
		}
		else {
			// session handling for login 
			// NOTE THAT session check is done by calling session.jsp in each html ...
			if (session.isNew() || session.getAttribute("id") == null) {
				session.setAttribute("id", id);
				session.setMaxInactiveInterval(24*60*60);
			}
			out.print("OK");
		}
	}
	
	rs.close();
	st.close();
	conn.close();
%>