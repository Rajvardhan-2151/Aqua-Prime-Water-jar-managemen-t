<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">
  

	<!-- title -->
	<title>Customer Sign Up</title>

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
						<a href="/Home.jsp">
							<h3>AQUA PRIME</h3>
						</a>
					</div>
					<!-- logo -->

					<!-- menu start -->
					<nav class="main-menu">
							<ul>
								<li class="current-list-item"><a href="/Home.jsp">Home</a>
								</li>
								<li><a href="/about.html">About</a></li>
								
								<li><a href="/SupplierViews/AfterSupplierLogin.jsp">Back</a></li>
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
	
	<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
					<div class="col-lg-8 offset-lg-2 text-center">
						<div class="breadcrumb-text">
							<!-- <p>Serving pure, safe and healthy drinking water that you deserve.</p> -->
							<h1>New customer</h1>
						</div>
					</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->

	<!-- Customer Sign Up section -->
	<div class="checkout-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				
									<h3 style="align-content: center"> Sign Up </h3>
									<br>
						    </div>

						      <div class="card-body">
										<!-- Customer Sign Up Form -->
						        <div class="billing-address-form">
                      <div class="customer-sign-up">
                      
						        	<form action="/addCustomerThroughSupplier" method="Post">
						            <!-- first name -->
                        <label for="first name">Enter First Name</label>
                        <p><input type="text" name="Fname" id="first name"placeholder="First Name"></p>
                        <!-- last name -->
                        <label for="last name">Enter Last Name</label>
                        <p><input type="text" name="Lname" id="last name"placeholder="Last Name"></p>
                        
                        
                        <label for="Address">Enter Your Address</label>
                       <p> <textarea name="Address" id="Address" placeholder="Address"cols="140" rows="5"></textarea></p>
                        <!-- Mob -->
                        
                        <label for="Mobile">Enter Mobile Number</label>
                        <p><input type="number" name="MobileNo" id="Mobile"placeholder="Mobile Number"></p>
                        <!-- Email -->
                        <label for="Email">Enter Your Email Id</label>
                        <p><input type="email" name="Email" id="Email" placeholder="Email"></p>
                        <!-- Billing Address -
                        <label for="Billing Address">Enter Your Billing Address</label>
                       <p> <textarea name="Billing Address" id="Billing Address" placeholder="Billing Address"cols="140" rows="5"></textarea></p>
                       <!-- Shipping Address -
                       <label for="Shipping Address">Enter Your Shipping Address</label>
                       <p> <textarea name="Shipping Address" id="Shipping Address" placeholder="Shipping Address"cols="140" rows="5"></textarea></p>
                       -->
                       <label for="Username">Enter User Name</label>
					   <p><input type="text" name="Username" id="Username"placeholder="Username"></p>
                       
                        <!-- password -->
                        <label for="Password">Enter Password</label>
						<p><input type="password" name="Password" id="Password"placeholder="Password"></p>
						 
						 
                       <!-- Pincode -->
                       <label for="Pincode">Enter Your Pincode</label>
                       <p><input type="number" name="Pincode" id="Pincode" placeholder="Pincode"></p>
                        
                         <!-- Shipping Address -->
                       <label for="Delivery Address">Enter Your Delivery Address</label>
                       <p> <textarea name="DeliveryAddress" id="DeliveryAddress" placeholder="Delivery Address"cols="140" rows="5"></textarea></p>
                      
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