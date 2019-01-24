<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"  %>
   
<%
        System.out.println("uid" + request.getParameter("uid"));
        System.out.println("uname" + request.getParameter("uname"));
        System.out.println("pass" + request.getParameter("upass"));
    
    
   
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/mysns",
        	
        		"root","asdf");
        
        Statement st = conn.createStatement();
        
        String sql = "SELECT id,password FROM user WHERE id =" +
                request.getParameter("uid");
        ResultSet rs = st.executeQuery(sql);
        if (rs.next() == false) {
        	out.println("NA");
        	return;
        }
        String pass = request.getParameter("upass");
        if (pass.equals(rs.getString("password"))== false) {
        	out.println("PS");
      
       // if (rs.getString("password") != request.gerparameter("upass") out.println("PS");//
       
            return;
            }
            
      
        session.setAttribute("id",request.getParameter("uid"));
        //session.setMaxInactiveInteval(60*60);
        out.println("OK");
        
        st.close();
        			        
        conn.close();
%>