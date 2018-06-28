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
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		ArrayList<Car> carArray = (ArrayList<Car>) session.getAttribute("cars");
		String search=request.getParameter("search");
		ArrayList carsSearch=new ArrayList();
		int count=0;
		//search for car
		for(Car car: carArray) {
			//if search name equals model or make of car
			if(car.getMake().equalsIgnoreCase(search)||car.getModel().equalsIgnoreCase(search)) {
				
				carsSearch.add(car);
				count++;
				
			}
				
				
				
			
	
		}
		
		session.setAttribute("count", count);
		session.setAttribute("carsSearch", carsSearch);
		RequestDispatcher rs = request.getRequestDispatcher("search.jsp");
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
