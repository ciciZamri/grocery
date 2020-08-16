<%@ include file="header.jsp" %>
<style>
img{
	height: 300px;
    width: auto;
    object-fit: cover;
    display: block;
    margin: 0 auto;
}
</style>
<% String[] item = (String[])request.getAttribute("item"); %>
    <div>
    	<img alt="image" src="<%= item[2] %>">
        <h2><%= item[0] %></h2>
        <p><%= item[1] %></p>
	</div>

<%@ include file="footer.jsp" %>