<%@page import="study.entity.Supplier"%>
<%@page import="java.util.List"%>
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
List<Supplier> supplier_list = (List<Supplier>)request.getAttribute("SupplierList");
for(Supplier sup : supplier_list)
{
%>
  <%=sup.getSupplierFname() %>
  <%=sup.getSupplierLname() %>
  <%=sup.getSupplierAddress() %>
  <%=sup.getSupplierMobileNo() %>
  <button>Delete</button>
<%} %>
</body>
</html>