<%@ include file="header.jsp" %>

<div class="register-form">
	<form action="register" method="post">
		<h2>Register</h2>
		<label>Name</label><input type="text" name="name"><br>
		<label>Email</label><input type="text" name="email"><br>
		<label>Password</label><input type="password" name="password"><br>
		<label>Retype password</label><input class="last" type="password" name="retype_password"><br>
		<% 
			String message = (String)request.getAttribute("message");
			if(message != null){
				out.print("<small class=\"error\">" + message + "</small>");
			}
		%>
		<input class="submit-btn" type="submit" value="Register"><br><br>
		<small>Already have an account? <a href="login">Login</a></small>
	</form>
</div>

<%@ include file="footer.jsp" %>