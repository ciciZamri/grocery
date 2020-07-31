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
</style>
</head>
<body>
<header>
	<div class="navbar">
		<div>
			<a class="logo">Grocery IO</a>
		</div>
		<div>
			<a href="explore">Explore</a>
			<a href="grocerylist">My Grocery List</a>
			<a href="about">About us</a>
			<a href="login">Log in</a>
		</div>
	</div>
</header>