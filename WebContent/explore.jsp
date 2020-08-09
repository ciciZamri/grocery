<%@ include file="header.jsp" %>
<link rel="stylesheet" href="css/explore.css">
<h2>${title}</h2>
<div class="container">
	<% String[][] items = (String[][])request.getAttribute("items"); %>
	<%for ( int i = 0; i < items.length; i++){ %>
        <a href="explore?category=<%= items[i][0] %>">
        	<div>
        		<img alt="image" src="<%= items[i][1] %>">
        		<p><%= items[i][0] %></p>
        	</div>
        </a>
    <%}%>
</div>

<%@ include file="footer.jsp" %>