<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->
<html>

<!-- Head -->
<head>

	<title>Travel Agency Sign In Form A Flat Responsive Widget Template :: W3layouts</title>

	<!-- Meta-Tags -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="keywords" content="Travel Agency Sign In Form Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- //Meta-Tags -->

	<!-- Custom-Styleheet-Links -->
		<link rel="stylesheet" href="agentlogin/css/style.css" 		 type="text/css" media="all">
		<link rel="stylesheet" href="agentlogin/css/animate-custom.css" type="text/css" media="all">
	<!-- //Custom-Styleheet-Links -->

	<!-- Fonts -->
		<link rel="stylesheet" href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" type="text/css" media="all">
		<link rel="stylesheet" href="//fonts.googleapis.com/css?family=Montserrat:400,700" 		  type="text/css" media="all">
	<!-- //Fonts -->

</head>
<!-- //Head -->



<!-- Body -->
<body>

	<h1 class="w3layouts agileits">TRAVEL AGENCY SIGN IN FORM</h1>

	<div class="container w3layouts agileits">

		<div class="content-left w3layouts agileits">
			<img src="agentlogin/images/background.jpg" alt="W3layouts Agileits">
			<p>Plan your next dream trip. Select your destination and leave the rest to us.</p>
			<a class="more w3layouts agileits" href="#">LEARN MORE</a>
			<div class="list w3layouts agileits">
				<ul class="w3layouts agileits">
					<li class="w3layouts agileits"><a href="#">About</a></li>
					<li class="li2 w3layouts agileits"><a href="#">Terms Of Use</a></li>
					<li class="w3layouts agileits"><a href="#">Contact</a></li>
				</ul>
			</div>
		</div>

		<div class="content-right w3layouts agileits">
			<section>
				<div id="container_demo">
					<a class="hiddenanchor w3layouts agileits" id="tologin"></a>
					<a class="hiddenanchor w3layouts agileits" id="toregister"></a>
					<div id="wrapper">
						<div id="login" class="animate w3layouts agileits form">
						<h3 style="color:red">${agentmsg}</h3>
							<h2 class="w3layouts agileits">Sign In</h2>
							<form  action="agentLog.html" autocomplete="on" method="post">
								<label>E-mail</label>
								<input type="text" name="email" required="">
								<label>Password</label>
								<input type="password" name="pass" required="">
								<div class="send-button w3layouts agileits">
									<p><a href="#">Forgot Password?</a></p>
									<form>
										<input type="submit" value="SIGN IN">
									</form>
									<div class="clear"></div>
								</div>
								<p class="change_link w3layouts agileits">
									Don't have an account? <a href="#toregister" class="to_register">Sign Up!</a>
								</p>
								<div class="clear"></div>
							</form>
							<div class="social-icons w3layouts agileits">
								<p>OR USE YOUR SOCIAL ACCOUNTS</p>
								<ul>
									<li class="fb w3ls w3layouts agileits"><a href="#"><span class="icons w3layouts agileits"></span><span class="text w3layouts agileits">Facebook</span></a></li>
									<li class="twt w3ls w3layouts agileits"><a href="#"><span class="icons w3layouts agileits"></span><span class="text w3layouts agileits">Twitter</span></a></li>
									<div class="clear"></div>
								</ul>
							</div>
							<div class="clear"></div>
						</div>
						<div id="register" class="animate w3layouts agileits form">
						<h3 style="color:red">${agentmsg}</h3>
							<h2>Sign up</h2>
							<form  action="agentregister.html" autocomplete="on" method="post">
								<form action="#" method="post">
									<label>Name</label>
									<input type="text" class="name w3layouts agileits" Name="name" required="">
									<label>Phone Number</label>
									<input type="text" class="phone w3layouts agileits" Name="mobile" required="">
									<label>E-mail</label>
									<input type="text" Name="email" required="">
									<label>Password</label>
									<input type="password" Name="pass" required="">
									<div class="send-button w3layouts agileits">
										<form action="#" method="post">
											<input type="submit" value="SIGN UP">
										</form>
									</div>
								</form>
								<p class="change_link w3layouts agileits">
									Already a member? <a href="#tologin" class="to_register">Sign In</a>
								</p>
								<div class="clear"></div>
							</form>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</section>
		</div>
		<div class="clear"></div>

	</div>

	<div class="footer w3layouts agileits">
		<p> &copy; 2016 Travel Agency Sign In Form. All Rights Reserved | Template by <a href="http://w3layouts.com" target="_blank">Gokul Rathod</a></p>
	</div>

</body>
<!-- //Body -->

</html>