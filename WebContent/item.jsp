<%@ include file="header.jsp" %>

<h1>Item details</h1>
<% String[] item = (String[])request.getAttribute("item"); %>
    <div>
    	<img alt="image" src="<%= item[2] %>">
        <h2><%= item[0] %></h2>
        <p><%= item[1] %></p>
	</div>

<%@ include file="footer.jsp" %>