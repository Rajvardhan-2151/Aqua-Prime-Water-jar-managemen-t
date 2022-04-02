<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Supplier</title>
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

<!-- header -->
<div class="top-header-area" id="sticker">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-sm-12 text-center">
				<div class="main-menu-wrap">
					<!-- logo -->
					<div class="site-logo">
						<a href="#">
							<h3>AQUA PRIME</h3>
						</a>
					</div>
					<!-- logo -->
					<nav class="main-menu">
						<ul>
							<li class="current-list-item"><a href="/Home.jsp">Home</a>
							</li>
							<li><a href="/ProviderViews/AfterProviderLogin.jsp">Back</a></li>
							
							
								<ul class="sub-menu">
									
									
								</ul>
							</li>
							<li>
								<div class="header-icons">
								</div>
							</li>
						
							<li>
								<div class="header-icons">
								</div>
						
								<div class="header-icons">
								</div>
							</li>
						</ul>
					</nav>

					<!-- menu start -->
			
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
							<h1>Add Supplier</h1>
						</div>
					</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->


<!-- Add Suppiler   section -->
	<div class="checkout-section mt-150 mb-150">
		<div class="container">
			<div class="row">
			
									<h3 style="align-content: center;">  Supplier info</h3>
									<br>
						    </div>

						      <div class="card-body">
										<!-- Customer Sign Up Form -->
						        <div class="billing-address-form">
                      <div class="customer-sign-up">
                   
						        	<form action="/AddSupplier" method="get">
						            <!-- first name -->
                        <label for="first name">Enter First Name</label>
                        <p><input type="text" name="firstName" id="first name"placeholder="First Name"></p>
                        <!-- last name -->
                        <label for="last name">Enter Last Name</label>
                        <p><input type="text" name="lname" id="last name"placeholder="Last Name"></p>
                        
                        
                        <label for="Address">Enter Your Address</label>
                       <p> <textarea name="address" id="Address" placeholder="Address"cols="140" rows="5"></textarea></p>
                        <!-- Mob -->
                        
                        <label for="Mobile">Enter Mobile Number</label>
                        <p><input type="number" name="mobile_no" id="Mobile"placeholder="Mobile Number"></p>
                        <!-- Email -->
                        <label for="Email">Enter Your Email Id</label>
                        <p><input type="email" name="email" id="Email" placeholder="Email"></p>
                        
                       <label for="Username">Enter User Name</label>
					   <p><input type="text" name="username" id="Username"placeholder="Username"></p>
                       
                        <!-- password -->
                        <label for="Password">Enter Password</label>
						<p><input type="password" name="password" id="Password"placeholder="Password"></p>
						 
						 
                       <!-- Pincode -->
                       <label for="Pincode">Enter Your Pincode</label>
                       <p><input type="number" name="pincode" id="Pincode" placeholder="Pincode"></p>
                        
                         <!-- Shipping Address -->
                       <label for="Delivery Address">Enter Your Delivery Address</label>
                       <p> <textarea name="working_area" id="DeliveryAddress" placeholder="Delivery Address"cols="140" rows="5"></textarea></p>
                      
                        <!-- confirm password -
                        <label for="confirmpassword">Confirm Password</label>
		<p><input type="password" name="confirmpassword" id="confirmpassword"placeholder="Enter Password Again"></p>-->
                        <!-- submit -->
												<!-- <a href="#" class="boxed-btn">Submit</a> by raj-->
												<p class="boxed-btn"><input type="submit" /></p>						        		<!-- <p><input type="tel" placeholder="Phone"></p>
						        		<p><textarea name="bill" id="bill" cols="30" rows="10" placeholder="Say Something"></textarea></p> -->
						        	</form>
                    </div>
						        </div>
						      </div>
						    </div>
						  </div>
						</div>

					</div>
				</div>

				
					
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end check out section -->
 
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