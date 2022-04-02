<%@page import="study.entity.NonDelivery"%>
<%@page import="study.entity.ExtraOrder"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
                table,
                th,
                td {
                    border: 1px solid black;
                }
            </style>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

	<!-- title -->
	<title>Aqua Prime Water Jar Management</title>

	<!-- favicon -->
	<link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
	<!-- google font -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
	<!-- fontawesome -->
	<link rel="stylesheet" href="assets/css/all.min.css">
	<!-- bootstrap -->
	<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	<!-- owl carousel -->
	<link rel="stylesheet" href="assets/css/owl.carousel.css">
	<!-- magnific popup -->
	<link rel="stylesheet" href="assets/css/magnific-popup.css">
	<!-- animate css -->
	<link rel="stylesheet" href="assets/css/animate.css">
	<!-- mean menu css -->
	<link rel="stylesheet" href="assets/css/meanmenu.min.css">
	<!-- main style -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- responsive -->
	<link rel="stylesheet" href="assets/css/responsive.css">
	


</head>
<body>
	
	<!--PreLoader-->
    <div class="loader">
        <div class="loader-inner">
            <div class="circle"></div>
        </div>
    </div>
    <!--PreLoader Ends-->
	
<!-- header -->
<div class="top-header-area" id="sticker">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-sm-12 text-center">
				<div class="main-menu-wrap">
					<!-- logo -->
					<div class="site-logo">
						<a href="index.html">
							<h3>AQUA PRIME</h3>
						</a>
					</div>
					<!-- logo -->

					<!-- menu start -->
					<nav class="main-menu">
							<ul>
								<li class="current-list-item"><a href="/Home.jsp">Home</a>
								</li>
								<li><a href="about.html">About</a></li>
								
								<li><a href="/CustomerViews/AfterCustomerLogin.jsp">Back</a></li>
								<li>
									<div class="header-icons">
									</div>
								</li>
								<li><a href="/Home.jsp">Logout</a></li>
								
							</ul>
						</nav>
					<a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
					<div class="mobile-menu"></div>
					<!-- menu end -->
				</div>
			</div>
		</div>
	</div>
</div>
<!-- end header -->

<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
					<div class="col-lg-8 offset-lg-2 text-center">
						<div class="breadcrumb-text">
							<!-- <p>Serving pure, safe and healthy drinking water that you deserve.</p> -->
							<h1>Order Details Are Shown Below</h1>
						</div>
					</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->


<%
List<ExtraOrder> subscripted_extraOrderList = (List<ExtraOrder>)request.getAttribute("extraOrder_subscripted");
List<ExtraOrder> extraOrder_nonSubscripted = (List<ExtraOrder>)request.getAttribute("extraOrder_nonSubscripted");
List<NonDelivery> nonDelivery_order = (List<NonDelivery>)request.getAttribute("nonDelivery_order");
%>

<!-- extraOrder_nonSubscripted -->
<%
if(extraOrder_nonSubscripted != null)
{%>

<div class="product-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="section-title">	
			<h4>Extra Order Details For Non Subscribed Customers</h4>
					
<table style="width:100%" >
  <tr>
    <th >Customer Name</th>
    <th>Jar Quantity</th>
    <th>Order Date</th>
    
  </tr>
<%  
for(ExtraOrder Nonsub_extraOrder : extraOrder_nonSubscripted)
{%>

  <tr>
    <td><%=Nonsub_extraOrder.getCustomerInfoTable().getCustomerFname()%> </td>
    <td><%=Nonsub_extraOrder.getJarQauntity() %> </td>
    <td><%=Nonsub_extraOrder.getOrderDate() %></td>
   
  </tr>
   
<%}%>
</table>	
		</div>
			</div>
			</div>
			</div>
			</div>
			
<%}
else
{
%>
<div class="col-lg-8 offset-lg-2 text-center">
<h4>Not Available</h4>
</div>
<%} %>

<!-- end extraOrder_nonSubscripted -->

<!-- subscripted_extraOrderList -->
<%
if(subscripted_extraOrderList != null)
{%>

<div class="product-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="section-title">	
			<h4>Extra Order Details For Subscribed Customers</h4>
					
<table style="width:100%" >
  <tr>
    <th >Customer Name</th>
    <th>Jar Quantity</th>
    <th>Order Date</th>
    
  </tr>
<%  
for(ExtraOrder sub_extraOrder : subscripted_extraOrderList)
{%>

  <tr>
    <td><%=sub_extraOrder.getCustomerInfoTable().getCustomerFname()%></td>
    <td><%=sub_extraOrder.getJarQauntity() %></td>
    <td><%=sub_extraOrder.getOrderDate() %></td>
   
  </tr>
   
<%}%>
</table>	
		</div>
			</div>
			</div>
			</div>
			</div>
			
<%}
else
{
%>
<div class="col-lg-8 offset-lg-2 text-center">
<h4>Not Available</h4>
</div>
<%} %>

<!-- end subscripted_extraOrderList -->


<!-- nonDelivery_order -->
<%
if(nonDelivery_order != null)
{%>

<div class="product-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="section-title">	
			<h4>Non Deliver Order Details</h4>
					
<table style="width:100%" >
  <tr>
    <th >Non Delivery Date</th>
    <th>Customer Name</th>   
  </tr>
<%  
for(NonDelivery non_deli : nonDelivery_order)
{%>

  <tr>
    <td><%=non_deli.getNonDeliveryDate() %></td>
    <td><%=non_deli.getSubscriptionTable().getCustomerInfoTable().getCustomerFname() %></td>
  </tr>
   
<%}%>
</table>	
		</div>
			</div>
			</div>
			</div>
			</div>
			
<%}
else
{
%>
<div class="product-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
<h4>Not Available</h4>
</div>
</div>
</div>
</div>
<%} %>

<!-- end nonDelivery_order -->


<!-- footer -->
	<div class="footer-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="footer-box about-widget">
						<h2 class="widget-title">About us</h2>
						<p>Aqua Prime is a pure web based application which helps in managing water jar supply chain.</p>
					</div>
				</div>
			
				<div class="col-lg-3 col-md-6">
					<div class="footer-box get-in-touch">
						<h2 class="widget-title">Get in Touch</h2>
						<ul>
							<li>support@aquaprime.com</li>
							<li>+00 111 222 3333</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box pages">
						<h2 class="widget-title">Pages</h2>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li><a href="about.html">About</a></li>
							<!-- <li><a href="shop.html">Shop</a></li> -->
							<li><a href="customerlogin.html">Customer</a></li>
							<li><a href="supplierlogin.html">Supplier</a></li>
							<li><a href="provider.html">Provider</a></li>
							
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end footer -->
	

	
	<!-- jquery -->
	<script src="assets/js/jquery-1.11.3.min.js"></script>
	<!-- bootstrap -->
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<!-- count down -->
	<script src="assets/js/jquery.countdown.js"></script>
	<!-- isotope -->
	<script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
	<!-- waypoints -->
	<script src="assets/js/waypoints.js"></script>
	<!-- owl carousel -->
	<script src="assets/js/owl.carousel.min.js"></script>
	<!-- magnific popup -->
	<script src="assets/js/jquery.magnific-popup.min.js"></script>
	<!-- mean menu -->
	<script src="assets/js/jquery.meanmenu.min.js"></script>
	<!-- sticker js -->
	<script src="assets/js/sticker.js"></script>
	<!-- main js -->
	<script src="assets/js/main.js"></script>

</body>
</html>