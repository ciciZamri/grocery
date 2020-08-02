<%@ include file="header.jsp" %>

<h1>landing page</h1>
<% String name = (String)request.getAttribute("name"); 
%>
<h3>${name}</h3>
<%@ include file="footer.jsp" %>