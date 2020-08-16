<%@ include file="header.jsp" %>
<style>
h2{
	width: fit-content;
	margin: 24px auto;
}

.container{
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
}

.container .item{
	margin: 8px;
	box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
	cursor: pointer;
	transition: 200ms;
	display: grid;
	place-items: center;
}

.container .item:hover{
	box-shadow: 0 19px 38px rgba(0,0,0,0.30), 0 15px 12px rgba(0,0,0,0.22);
}

.container .label{
	display: flex;
    justify-content: space-between;
    width: 90%;
    align-items: center;
    font-size: large;
    font-weight: bold;
}

img{
	width: 250px;
	height: 230px;
	object-fit: cover;
	display: block;
}

.add-btn{
	position: relative;
}

.add-btn .tooltip{
	display: none;
	position: absolute;
	font-size: medium;
	font-weight: normal;
	width: max-content;
	bottom: 42px;
	left: -30px;
	background-color: black;
	border-radius: 8px;
	opacity: 70%;
	padding: 8px;
	color: white;
}

.add-btn:hover .tooltip{
	display: block;
}

.svg-circleplus { height: 30px; stroke: black; transition: 200ms;}
.svg-circleplus:hover { height: 35px; stroke: black; }

.container a{
	text-decoration: none;
	color: black;
	display: inline-block;
}

</style>
<h2>${title}</h2>
<div class="container">
	<% String[][] items = (String[][])request.getAttribute("items"); %>
	<% String section = (String)request.getAttribute("section"); %>
	<%for ( int i = 0; i < items.length; i++){ %>
        <a href="explore?<%= section %>=<%= items[i][0] %>">
        	<div class="item">
        		<img alt="image" src="<%= items[i][1] %>">
        		<div class="label">
        			<p><%= items[i][0] %></p>
        		<% 
	        		if(section.equals("groceryitem")){
	    				out.print("<a href=\"grocerylist?action=add&item=" + items[i][0] + "\"><div class=\"add-btn\"><svg class=\"svg-circleplus\" viewBox=\"0 0 100 100\">"
	    						  + "<circle cx=\"50\" cy=\"50\" r=\"45\" fill=\"none\" stroke-width=\"7.5\"></circle>"
	    						  + "<line x1=\"32.5\" y1=\"50\" x2=\"67.5\" y2=\"50\" stroke-width=\"5\"></line>"
	    						  + "<line x1=\"50\" y1=\"32.5\" x2=\"50\" y2=\"67.5\" stroke-width=\"5\"></line>"
	    						+ "</svg><span class=\"tooltip\">Add to my list</span></div></a>");
	    			}
        		%>
        		</div>
        	</div>
        </a>
    <%}%>
</div>

<%@ include file="footer.jsp" %>