package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Car;
import com.user.Customer;

/**
 * Servlet implementation class checkOutServlet
 */
@WebServlet("/checkOutServlet")
public class checkOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public checkOutServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ArrayList<Car> cartArray = (ArrayList<Car>) session.getAttribute("cartCars");
		ArrayList<Car> carArray = (ArrayList<Car>) session.getAttribute("cars");
		ArrayList<Car> adminArray= (ArrayList<Car>) session.getAttribute("admin");
		// get checkout form parameters
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String nameoncard = request.getParameter("cc-name");
		long cardNum = Long.parseLong(request.getParameter("cc-number"));
		String exp = request.getParameter("cc-expiration");
		String cvv = request.getParameter("cc-cvc");

		/*
		 * String firstName, String lastName, String username, String password, String
		 * address, String country, String state, String zip, String nameOnCard, String
		 * exp, String cvv, long cardNum, int custNum
		 */
		Customer cust = new Customer(firstName, lastName, username, password, address, country, state, zip, nameoncard,
				exp, cvv, cardNum);
		cust.setCustNum();	
		
		// loop through admin car array
		for (Car car : cartArray) {
			Date now=new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			//loop through customer car array anf id id match change status to sold
			for (Car tempcar: adminArray)
			if(car.getCarId()==tempcar.getCarId()) {
				//change status o sold on admin page
				tempcar.setStatus("sold");
				tempcar.setSolddate(sdf.format(now));
			}
		}
		
		
		for (Car car : cartArray) {
			//add cars in cart to array of sold cars for customer
			cust.setSoldCarArray(car);
			// remove car from carArray after sold
			carArray.remove(car);

		}
		
		String paid = "Payment Received";
		// remove all cars from arraylist
		cartArray.clear();
		double total = cust.totalSold();
		double invtotal = totalSum(adminArray);
		double cartSum = 0;

		session.setAttribute("admin", adminArray);
		session.setAttribute("invtotal", invtotal);
		// send empty cart to session
		session.setAttribute("cartSum", cartSum);
		// send details about cust and their list of purchased items to session
		session.setAttribute("cartCars", cartArray);
		// send car array without purchased cars to session
		session.setAttribute("cars", carArray);
		// add cart total sum
		session.setAttribute("soldSum", total);
		session.setAttribute("payment", paid);
		// list of cars sold to customer
		session.setAttribute("soldCarArray", cust.getSoldCarArray());
		session.setAttribute("cust", cust);
		RequestDispatcher rs = request.getRequestDispatcher("Loginpage.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private double totalSum(ArrayList<Car> cartArray) {
		double sum=0;
		for(Car car: cartArray) {
			
			sum+=car.getPrice();
			
		}
		
		return sum;
	}

}
