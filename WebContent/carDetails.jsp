<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./styles/styles.css">
    <link href="./styles/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./styles/carousel.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
</head>
<body>

	<!-- Nav bar -->
	<!-- Nav bar -->
<jsp:include page="header.jsp"/>
		<br>				
<a href="cart.jsp"><button type="button" class=" btn-primary btn-sm">Cart</button></a>
<a href="ShopServlet"><button type="button" class=" btn-secondary btn-sm">Continue Shopping</button></a>
<a href="myAccount.jsp"><button type="button" class=" btn-secondary btn-sm">My Account</button></a>						
			<br><br>			
	<div class="detailcontainer">
		<div class="galler">
			 <img src="${mycar.img}"  alt="Mountains" width="200" height="200">
			
			
		</div>
		
		
  <div class="form-group mb-2">
   
  </div>
  <form class="form-inline" method="get" action="bestOfferServlet?carId=?bestOffer=">
  <c:if test = "${mycar.getcarAge()==true}">
  <div class="form-group mx-sm-3 mb-2">
    <label for="inputPassword2" class="sr-only">Best Offer</label>
     <input type="hidden" class="form-control"  name="carId" id="inputPassword2" value="${mycar.carId}" placeholder="Best Offer">
    <input type="text" class="form-control"  name="bestoffer" id="inputPassword2" placeholder="Best Offer">
   
  </div>
  
  <button type="submit" class="btn-primary mb-2">Best Offer</button>
  <button type="button" class="btn-primary btn-outline-secondary mb-2"><c:out value="${offerststus}"></c:out></button>
   </c:if>
   <a href="cartServlet?carId=${mycar.carId}"><button type="button" name="cart"   class=" btn-primary mb-2">Add Cart</button></a>
</form>
		
		<div class="tabledetail">

			<table class="table table-striped">

				<thead>
					<tr>
						<th scope="col">Desc</th>
						<th scope="col">Details</th>

					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="col">Inventory#</th>
						<td>${mycar.carId}</td>
					</tr>
					<th scope="col">Year</th>
					<td>${mycar.year}</td>

					<tr>
						<th scope="col">Condition</th>
						<td>${mycar.condition}</td>

					</tr>
					<tr>
						<th scope="col">Make</th>
						<td>${mycar.make}</td>
					</tr>
					<tr>
						<th scope="col">Model</th>
						<td>${mycar.model}</td>
					</tr>

					<tr>
						<th scope="col">Description</th>
						<td>${mycar.description}</td>
					</tr>
					<tr>
						<th scope="col">Millage</th>
						<td>${mycar.millage}</td>
					</tr>
					<tr>
						<th scope="col">Price</th>
						<td>$${mycar.price}</td>
					</tr>
					<tr>

					</tr>

				</tbody>

			</table>

		</div>
	</div>
	<!-- Loop through cars array to display cars -->
	<!-- 
	<div class="gallery">

		<a target="_blank" href="mountains.jpg"> <img
			src=".\images\img1.jpg" alt="Mountains">
		</a>
		<div class="desc">
			<c:out value="${car.make}" />
		</div>
		<c:out value="${car.model}" />
	</div>
 -->
	<!-- Image gallery -->
	<jsp:include page="scripts.jsp"/>
</body>
</html>