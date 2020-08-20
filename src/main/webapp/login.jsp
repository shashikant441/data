<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	crossorigin="anonymous">

<style>

/* sign in FORM */

#logreg-forms {
	width: 600px;
	margin: 10vh auto;
	background-color: coral;

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
			<form action="login.do" method="post">

	<h1>Login Page</h1>

     <br>  <label for="email"> Email address</label>
       <input type="email" name="form-control" id="email"></br>
 
	<br> <label for="password">Password</label>
		<input type="password" name="form-control" id="password"></br>

 		<div class="form-group">
						<button id="submit" name="submit" value="1"
						class="btn btn-block btn-success">Log in</button>
							</div>
  
  <div class="form-group">
					<a href="index.jsp"><button id="submit" name="home" value="1"
						class="btn btn-block btn-success">Home</button></a>
							</div>
   
   </form>

</body>
</html>