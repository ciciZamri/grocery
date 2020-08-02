<%@ include file="header.jsp" %>

<h1>grocery list</h1>
<%
	String name = (String)request.getAttribute("name");
	System.out.println("kkkgg"+name);
	out.print(name);
%>

<%@ include file="footer.jsp" %>