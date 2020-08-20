<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">

<!-- Bootstrap -->
  <link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>

<style>

/* sign in FORM */

#logreg-forms {
	width: 600px;
	margin: 10vh auto;
	background-color: turquoise;

}
#logreg-forms form {
	width: 150%;
	max-width: 410px;
	padding: 15px;
	margin: auto;
}
#logreg-forms .form-control {
	position: relative;
	box-sizing: border-box;
	height: auto;
	padding: 10px;
	font-size: 16px;
}
#logreg-forms .form-control:focus {
	z-index: 2;
}

#logreg-forms .social-login {
	width: 390px;
	margin: 0 auto;
	margin-bottom: 14px;
}
#logreg-forms .social-btn {
	font-weight: 100;
	color: white;
	width: 190px;
	font-size: 0.9rem;
}
#logreg-forms a {
	display: block;
	padding-top: 10px;
	color: lightseagreen;
}
#logreg-form .lines {
	width: 200px;
	border: 1px solid red;
}

#logreg-forms .facebook-btn {
	background-color: #3C589C;
}
#logreg-forms .google-btn {
	background-color: #DF4B3B;
}
#logreg-forms .form-reset, #logreg-forms .form-signup {
	display: none;
}
#logreg-forms .form-signup .social-btn {
	width: 210px;
}
#logreg-forms .form-signup input {
	margin-bottom: 2px;
}
.form-signup .social-login {
	width: 210px !important;
	margin: 0 auto;
}
	
</style>

<body>
		<div id="logreg-forms">
				<div class="wrapper">
			<form action="submit.do" method="post">
    	
    	<div class="navbar navbar-inverse navbar-static-top">
	<div class="container">
		<a href="#" class="navbar-brand" style="color: white">Military Equipment</a>
		<button class="navbar-toggle" data-toggle="collapse"
			data-target=".navHeaderCollapse"></button>
		
		<a href="login.jsp" class="navbar-brand" style="color: white">Login</a>
		<button class="nav navbar-nav navbar-right" data-toggle="collapse"
			data-target=".navHeaderCollapse"></button>
		
	</div>
</div>
	
	
	<br>Country Name<select name="CountryName" class="form-control" placeholder="country name" required="required">
				<option value="">----Country Name----</option>
				<option value="India">India</option>
				<option value="Rasian">Rasian</option>
				<option value="Japan">Japan</option>
				<option value="China">China</option>
				<option value="America">America</option>
				<option value="England">England</option>
				<option value="Canada">Canada</option></br>
			</select> </br>
	
	<br>Military Type<select name="MilitaryType" class="form-control" placeholder="military type" required="required">
				<option value="">----Military Type----</option>
				<option value="Army">Indian Army</option>
				<option value="Navy">Indian Navy</option>
				<option value="AirForce">Indian Air Force</option>
			</select> </br>
	
	<br><label for="name">Equipment</label>
			<input type="text" id="equipment" name="Equipment" class="from-controler" placeholder="Equipment" required="required"></input></br>
	<br><label for="name">Price</label>
			<input type="text" id="price" name="Price" class="from-controler" placeholder="Price" required="required"></input></br>
	<br><label for="name"> Quantity</label>
			<input type="text" id="quantity" name="Quantity" class="from-controler" placeholder="Quantity" required="required"></input></br>
	<br><label for="name">Delivery Year</label>
			<input type="text" id="dilivery" name="DeliveryYear" class="from-controler" placeholder="Dilivery Year" required="required"></input></br>
		
		<br><button class="button" type="save"  style="text-align: center">Save</button>
		</br>
	
	</form>
	
	<!-- Optional JavaScript -->
	<!-- jQuery first. Bootstrap JS -->
	
	<script src=https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous""></script>
	
	
	
	
	
</body>
</html>