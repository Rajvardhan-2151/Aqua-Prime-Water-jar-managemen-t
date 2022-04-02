<%@page import="study.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

	<!-- title -->
	<title>After Customer Logged In</title>

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
	
	<%
	  Customer customer = (Customer)session.getAttribute("customer");
	
	   int customer_id = customer.getCustomerId();
	   
	%>
	
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
							<a href="/Home.jsp">
								<h3>AQUA PRIME</h3>
							</a>
						</div>
					
						<nav class="main-menu">
							<ul>
								<li class="current-list-item"><a href="/Home.jsp">Home</a>
								</li>
								<li><a href="/about.html">About</a></li>
								
								<li><a href="/CustomerViews/CustomerLogin">Customer</a></li>
								<li>
									<div class="header-icons">
									</div>
								</li>
								<li><a href="/logout">Logout</a></li>
								
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

	<!-- search area -->
	<div class="search-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<span class="close-btn"><i class="fas fa-window-close"></i></span>
					<div class="search-bar">
						<div class="search-bar-tablecell">
							<h3>Search For:</h3>
							<input type="text" placeholder="Keywords">
							<button type="submit">Search <i class="fas fa-search"></i></button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end search arewa -->
	
	<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
					<div class="col-lg-8 offset-lg-2 text-center">
						<div class="breadcrumb-text">
							<!-- <p>Serving pure, safe and healthy drinking water that you deserve.</p> -->
							<h1>Welcome <%=customer.getCustomerFname() %></h1>
						</div>
					</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->
<!-- product section -->
<div class="product-section mt-150 mb-150">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 offset-lg-2 text-center">
				<div class="section-title">	
					<h3><span class="orange-text">Customer</span> Functionalities</h3>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-4 col-md-6 text-center">
				<div class="single-product-item">
					<div class="product-image">
				       <a href="/ViewBill?customer_id=<%=customer_id%>"><img src="assets/img/vieworder.jpg" alt=""></a>
					</div>
					<h3>View Bill</h3>
				
			
				</div>
			</div>
			<div class="col-lg-4 col-md-6 text-center">
				<div class="single-product-item">
					<div class="product-image">
						<a href="/getOrders?cust_id=<%=customer_id%>"><img src="assets/img/viewbill.jpg" alt=""></a>
					</div>
					<h3>View Order</h3>
					
				</div>
			</div>
			<div class="col-lg-4 col-md-6 offset-md-3 offset-lg-0 text-center">
				<div class="single-product-item">
					<div class="product-image">
						<a href="/redirectComapliant?customer_id=<%=customer_id%>"><img src="assets/img/complaint.jpg" alt=""></a>
					</div>
					<h3>Complaint</h3>
				</div>
			</div>
			
			<div class="col-lg-4 col-md-6 offset-md-3 offset-lg-0 text-center">
				<div class="single-product-item">
					<div class="product-image">
						<a href="/redirectExtraOrderPage?cust_id=<%=customer_id%>"><img src="assets/img/complaint.jpg" alt=""></a>
					</div>
					<h3>Extra Order</h3>
				</div>
			</div>
		</div>

		<!-- <div class="col-lg-4 col-md-6 offset-md-3 offset-lg-0 text-center">
			<div class="single-product-item">
				<div class="product-image">
					<a href="index.html"><img src="assets/img/logout.jpg" alt=""></a>
				</div>
				<h3>Log Out</h3>
			</div>
		</div> -->
	</div>
	</div>
</div>
<!-- end product section -->

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