<%@ include file="header.jsp" %>



<style media="screen">
a{

  color:white;
}
#bg{
  position:absolute;
  top:0;
  left:0;
  width:100%;
  height:700px;
  padding: 0;
  margin: 0;
  z-index:-1;
  filter: brightness(50%);
}

.wrapper{
  color:white;
  display:grid;
  grid-template-columns: 1fr 1fr;
  grid-auto-rows:minmax(300px,auto);
  grip-gap:1em;
  justify-items:center;
  align-items:center;
}
</style>


<%@ include file="footer.jsp" %>

<img id="bg"src="images/grocery.jpg" alt="" >

<h1>landing page</h1>
   <h3>${name}</h3>

  <div class="wrapper">

    <div class="box1">
      <h1 style="font-size:70px;padding-left:1em;">Grocery shooping, <br> made easier</h1>
      <h4 style="font-size:25px;padding-left:3em;">Get information about groceries in a swift, and get to learn about <br> new items!</h4>
     </div>
    <div class="box1">
      <img style="width:500px;height:500px;" src="images/coconut.png" alt="">
      </div>

  </div>
