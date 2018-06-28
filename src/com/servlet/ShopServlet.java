package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Car;
import com.user.Dealership;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String condition,String make, String model, String description, int year, int millage, String imagelink
		
		HttpSession session=request.getSession(true);
		ArrayList<Car> carArray= (ArrayList<Car>) session.getAttribute("cars");
		ArrayList<Car> adminArray= (ArrayList<Car>) session.getAttribute("admin");
		
		
		
		
		
		Dealership dealership=(Dealership) session.getAttribute("dealership");
	
		if(dealership==null) {
			
			dealership=new Dealership();
		}	
		
		//create admin array for inventory report
		if(adminArray==null) {
			adminArray = new ArrayList();
			for(Car car: dealership.getcarArray()) {
				
				adminArray.add(car);
			}
		
		}
	
		//create http session and add car array in session then redirect to the shop page
		
		//call dealership to get array of cars
		session.setAttribute("admin", adminArray);
		session.setAttribute("cars", dealership.getcarArray());
		session.setAttribute("dealership", dealership);
		RequestDispatcher rs=request.getRequestDispatcher("Shop.jsp");
		rs.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public Dealership newDeal(Dealership deal, ArrayList<Car> carArray) {
		Dealership  temp;
		if(carArray==null) {
		 temp=new Dealership();
		temp.createCars();
		}else {
			
			temp=deal;
		}
		
		return temp;
	}

}
