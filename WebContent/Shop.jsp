<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.user.Dealership"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.user.Car"%>
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
<jsp:include page="header.jsp"/>
<!-- end Nav bar -->
	


	<!-- Loop through cars array to display cars -->
	
	
	<c:forEach var="car" items="${cars}" >
		<div class="gallery">
			<a target="_blank"  href="DetailsServlet?carId=${car.carId}"> 
			<img src="${car.img}" alt="${car.make}" width="300" height="200" >
			</a>
			<div class="desc">
			<c:out value="${car.year}" />
				<c:out value="${car.make}" />
				<c:out value="${car.model}" />
				<br>
				Price:** $<c:out value="${car.price}" />
				<br>
			
			
				<a target="_blank"  href="DetailsServlet?carId=${car.carId}"><button  type="button" name="detail" class="btn-success btn-sm" value="">See Details</button></a>
				 <c:if test = "${car.getcarAge()==true}">
       <a target="_blank"  href="DetailsServlet?carId=${car.carId}">  <button type="button" class="btn-primary btn-sm">Best Offer</button></a>
     			 </c:if>
				
			</div>
		</div>
	</c:forEach>
	
	
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