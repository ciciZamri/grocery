<%@ include file="header.jsp" %>

<div class="login-form">
	<form action="login" method="post">
		<h2>Login</h2>
		<label>Email</label><input type="text" name="email"><br>
		<label>Password</label><input class="last" type="password" name="password"><br>
		<%
			String message = (String)request.getAttribute("message");
			if(message != null){
				out.print("<small class=\"error\">" + message + "</small>");
			}
		%>
		<input class="submit-btn" type="submit" value="Login"><br><br>
		<small>Not have an account? <a href="register">Register</a></small>
	</form>
</div>

<%@ include file="footer.jsp" %>