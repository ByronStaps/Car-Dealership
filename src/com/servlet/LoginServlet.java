package com.servlet;

//Car Sales system is an application that computerizes the conventional car sale procedure which we are aware of. This is a Java/HTML based application. This helps in managing data related to buyers and sellers of the cars. Business reports can also be generated and viewed.
//
//This program should handle a new and used vehicles inventory with minimum 10 cars. Every detail of a vehicle like manufacturer name, date of purchase, Kilo meters ran( in case of used vehicles), price, make/model, car description picture/s of the car etc.
//
//If a user click to view details of a car we should display the car details :eg
//name, model, year build, price, description, picture, etc...
//
//
//If a car is sitting in inventory for more than 120 days, there is be an option to place a bid on the car.
//Bidding cars can be sold at a discounted price up to 10% if and only if the dealership's purchase date is over 120 days.
//
//The inventory should have minimum 3 cars with idle days of 120+.
//
//The application to have a reporting section which display information about all transactions made, including the person who purchase the car. 
//This reporting page should order transaction by date starting with the most recent purchase.
//
//A user should also be able to search for a type (model) car from the inventory.
//
//The inventory should only have cars available to be sold. If a car has been sold 
//the inventory should reflect this behavior. 




import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(true);
		Customer cust=(Customer) session.getAttribute("cust");
		
		String userName=request.getParameter("user");
		String password	=request.getParameter("pass");	
		String error;
		//String error="You dont have an account";
		 try {
	       
	      
		if(userName.equals(cust.getUsername())&&password.equals(cust.getPassword())) {
			 error=" ";
			 String paid="";
			 session.setAttribute("payment", paid);
			response.sendRedirect("myAccount.jsp");
			
		}else {
			
			response.sendRedirect("Loginpage.jsp");
			
		}} catch (NullPointerException e){
			error="You dont have an account";
	         response.sendRedirect("Loginpage.jsp");
	         session.setAttribute("error", error);
	      }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
