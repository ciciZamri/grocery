<%@ include file="header.jsp" %>
<style>
p, h3{
	margin: 2px;
}
.icon{
	margin: 0 4px;
	cursor: pointer;
	transition: 200ms;
}

.icon:hover{
	transform: scale(1.1, 1.1);
}

.item{
	border: 2px solid grey;
	display: flex;
	align-items: center;
	padding: 8px;
	border-radius: 20px;
	margin: 8px;
}

.item > div{
	margin: 8px;
}

.item .img-container{
	width: 80px;
	overflow: hidden;
}

.item img{
	height: 80px;
    object-fit: cover;
}

.item .text{
	flex: 1;
}

.add-btn{
	display: flex;
	justify-content: center;
	align-items: center;
	width: max-content;
	margin: 0 auto;
	font-size: large;
	font-weight: medium;
	padding: 12px;
	padding-right: 20px;
	border: none;
	border-radius: 4px;
	background-color: yellow;
	cursor: pointer;
}

.add-btn:hover{
	border: 3px solid black;
	background-color: white;
}
</style>

<h1>My Grocery list</h1>
<% String[][] items = (String[][])request.getAttribute("items"); %>
<%for ( int i = 0; i < items.length; i++){ %>
<div class="item">
	<div class="img-container">
		<img src="<%= items[i][1] %>">
	</div>
	<div class="text">
		<h3><%= items[i][0] %></h3>
		<p><%= items[i][2] %></p>
	</div>
	<div>
		<svg class="icon icon-edit" height="24" viewBox="0 0 24 24" width="24" xmlns="http://www.w3.org/2000/svg">
	    	<path d="M3 17.25V21h3.75L17.81 9.94l-3.75-3.75L3 17.25zM20.71 7.04c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.39-.39-1.02-.39-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z"/>
	    </svg>
	    <svg class="icon icon-delete" height="24" viewBox="0 0 24 24" width="24" xmlns="http://www.w3.org/2000/svg">
      		<path d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"/>
    	</svg>
	</div>
</div>
<%}%>
<a><button class="add-btn">
	<svg class="icon icon-add" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
      <path d="M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"/>
    </svg>
    <p>Add</p>
</button></a>
<%@ include file="footer.jsp" %>