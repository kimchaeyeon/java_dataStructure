<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="java.sql.*"  %>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
    		"jdbc:mysql://localhost:3306/market","root","asdf");
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM user");
    while(rs.next()){
    	out.println(rs.getString("id")+"<br>");
    }
    rs.close();
    st.close();
    conn.close();
    %>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>