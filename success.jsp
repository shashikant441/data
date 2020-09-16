<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>

/* sign in FORM */

#logreg-forms {
	width: 800px;
	margin: 10vh auto;
	background-color: aqua;

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
#logreg-forms button[type="submit"] {
	margin-top: 50px;
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

<div class="container">
	
	<h1> Equipment Details :</h1>
	<table class="table table-striped">
		<tbody>
			<tr>
				<td>Country Name</td>
				<td>:<b>${militaryDTO.countryName}</b></td>
			</tr>
			<tr>
				<td>Military Type</td>
				<td>:<b>${militaryDTO.militaryType}</b></td>
			</tr>
			<tr>
				<td>Equipment</td>
				<td>:<b> ${militaryDTO.equipment}</b></td>
			</tr>
			<tr>
				<td>Price</td>
				<td>:<b>${militaryDTO.price}</b></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td>:<b> ${militaryDTO.quantity}</b></td>
			</tr>
			<tr>
				<td> Delivery Year</td>
				<td>:<b>${militaryDTO.deliveryYear}</b></td>
			</tr>
			<tr>
				<td> Total Price</td>
				<td>:<b>${militaryDTO.price*2}</b></td>
			</tr>
			
		</tbody>
	</table>

		<a href="index.jsp">Back to home page</a>
</div>
</body>
</html>