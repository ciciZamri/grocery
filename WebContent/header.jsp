<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	font-family: sans-serif;
}

.error{
	color: red;
}

.navbar{
	display: flex;
	justify-content: space-between;
	margin: 16px 0px;
}

.navbar a{
	padding: 0px 12px;
	text-decoration: none;
	font-weight: 600;
}

.navbar a:hover{
	color: grey;
}

.logo{
	font-size: x-large;
	font-weight: bolder;
	cursor: pointer;
}

.login-form, .register-form{
	width: 100%;
	height: 70vh;
	display: grid;
	place-items: center;
}

.login-form form, .register-form form{
	border: 1px solid grey;
	padding-left: 24px;
	padding-right: 24px;
	padding-bottom: 24px;
	border-radius: 8px;
}

.login-form label, .register-form label{
	display: block;
}

.login-form input, .register-form input{
	height: 28px;
	margin: 4px 0px 16px 0px;
	padding: 4px;
	width: 270px;
	border: 1px solid grey;
	border-radius: 5px;
}

.login-form .last, .register-form .last{
	margin-bottom: 4px;
}

.login-form .submit-btn, .register-form .submit-btn{
	float: right;
	background-color: blue;
	color: white;
	border: none;
	width: auto;
	height: 32px;
	padding: 4px 12px 4px 12px;
	cursor: pointer;
}
</style>
</head>
<body>
<header>
	<div class="navbar">
		<div>
			<a href="main" class="logo">Grocery IO</a>
		</div>
		<div>
			<a href="explore">Explore</a>
			<a href="grocerylist">My Grocery List</a>
			<a href="about">About us</a>
			<a href="login">Log in</a>
		</div>
	</div>
</header>