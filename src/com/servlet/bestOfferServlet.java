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

/**
 * Servlet implementation class bestOfferServlet
 */
@WebServlet("/bestOfferServlet")
public class bestOfferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bestOfferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		ArrayList<Car> carArray= (ArrayList<Car>) session.getAttribute("cars");
		int carId=Integer.parseInt(request.getParameter("carId"));
		int bestOffer=Integer.parseInt(request.getParameter("bestoffer"));
		
		String OfferStatus=" ";
		
		for(Car car: carArray) {
			if(car.getCarId()==carId) {
				int price=car.getPrice();
				
				if(bestOffer<price*0.9) {
					
					OfferStatus="    Offer Declined";
					
				}
				else {
					OfferStatus="    Offer Accepted";
					car.setPrice(bestOffer);
				}
			}
		}
		
		session.setAttribute("offerststus", OfferStatus);
		RequestDispatcher rs=request.getRequestDispatcher("carDetails.jsp");
		rs.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
