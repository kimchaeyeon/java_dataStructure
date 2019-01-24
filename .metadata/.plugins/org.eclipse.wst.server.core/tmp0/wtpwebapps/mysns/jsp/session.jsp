<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
        if(session.getAttribute("id") == null) {
        	out.println("NA");
        }
        else {
        	out.println(session.getAttribute("id"));
        }
%>

