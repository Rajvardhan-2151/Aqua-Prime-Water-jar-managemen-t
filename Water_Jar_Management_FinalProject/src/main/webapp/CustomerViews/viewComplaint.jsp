<%@page import="java.util.List"%>
<%@page import="study.entity.ComplaintTable"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<ComplaintTable> complaints = (List<ComplaintTable>)request.getAttribute("comp");
%>
<%
for(ComplaintTable complaint : complaints)
{
%>
<%=complaint.getComplaintInfo() %>
<%=complaint.getComplaintDate() %>
<%
}
%>
</body>
</html>