<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%
out.println("Database connection test ... <br><br>");

Class.forName("com.mysql.jdbc.Driver").newInstance();

Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "asdf");

java.sql.Statement st = con.createStatement();
ResultSet rs = st.executeQuery("show database");
while (rs.next()){
	String str = rs.getNString(1);
	out.println(str + "<br>");
}
%>
</body>
</html>

