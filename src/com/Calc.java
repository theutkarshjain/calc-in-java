package com;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Calc
 */
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int add = a+b;
		int sub = a-b;
		request.setAttribute("t1", a);
		request.setAttribute("t2", b);
		
		if(request.getParameter("add") != null)
		{
			request.setAttribute("Calc", add);
		}
		else{
			request.setAttribute("Calc", sub);
		}
		RequestDispatcher dis = request.getRequestDispatcher("Calc.jsp");
		dis.forward(request, response);
		
	}

}
