
	
	<!-- Nav bar -->
	<nav class="navbar navbar-light bg-light">
	<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
		<li class="nav-item"><a class="nav-link active"
			id=""  href="index.jsp" role="tab"
			aria-controls="pills-home" aria-selected="true">Home</a></li>
			
			
		<li class="nav-item"><a class="nav-link" id=""
			  href="ShopServlet" role="tab"
			aria-controls="pills-profile" aria-selected="false">Shop</a></li>
			
			
		<li class="nav-item"><a class="nav-link" id="pills-contact-tab"
			  href="contact.jsp" role="tab"
			aria-controls="pills-contact" aria-selected="false">Contact us</a></li>
	<!-- 	<li class="nav-item"><a class="nav-link" id="pills-contact-tab"
			  href="myAccount.jsp" role="tab"
			aria-controls="pills-contact" aria-selected="false">My Account</a></li> -->
	<li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="myAccount.jsp" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Accounts
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="admin.jsp">Admin</a>
          <a class="dropdown-item" href="myAccount.jsp">My Account</a>
          <div class="dropdown-divider"></div>
          
        </div>
      </li>
			

	</ul>

	<form class="form-inline" method="post" action="searchServlet">
		<input class="form-control mr-sm-2" name="search" type="search" placeholder="Search make/model"
			aria-label="Search">
		<button class="btn-outline-success my-2 my-sm-0" type="submit">Search</button>
	</form>

	</nav>
<!-- end header -->

