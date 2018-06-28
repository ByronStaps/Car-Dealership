<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./styles/styles.css">

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
<!-- end Nav bar -->
	<!-- Nav bar -->

	<!-- Login Form -->
	<form class="logpage" method="post" action="LoginServlet">
	<h3 style="color:Blue">${payment}</h3>
	<h5>Login to see Your Account</h5>
		<div class="form-group">
		
			<label for="username">UserName</label> <input
				type="username" name="user" class="form-control" id="user"
				aria-describedby="emailHelp" placeholder="user"> <small
				id="emailHelp" class="form-text text-muted">We'll never
				share your userName.</small>
		</div>
		<div class="form-group">
		
			<label for="exampleInputPassword1">Password:</label> <input
				type="password"  name="pass" class="form-control" id="exampleInputPassword1"
				placeholder="password">
				
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
		<p style="color:red">${error}</p>
	</form>
</body>
</html>