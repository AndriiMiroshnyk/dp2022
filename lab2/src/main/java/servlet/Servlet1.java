package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import crud.Lab2CrudInterface;
import laptops.Laptops;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfigInterface servletConfig;
	Lab2CrudInterface lab2Crud;
	
	public Servlet1() {
		super();
		this.servletConfig = new ServletConfig();
		this.lab2Crud = servletConfig.getCrud();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		//Laptops laptops1 = new Laptops("MACBOOK PRO", "assets/mac.jpg", "The MacBook Pro is the most powerful laptop Apple has ever made. If you’re willing to pay the price (and it’s a steep price), you’ll almost certainly be satisfied with what this machine can do.");
		//Laptops laptops2 = new Laptops("HP SPECTRE X360", "assets/spectre.jpg", "It’s hard to come up with a single complaint about the Spectre x360 14. It’s a drop-dead gorgeous machine with a sturdy build and a premium look and feel.");
		//Laptops laptops3 = new Laptops("DELL XPS 13", "assets/xps.jpg", "If you’re looking for a convertible laptop that does just about everything right, we recommend Dell’s latest XPS 13 2-in-1. It features a sturdy and well-made chassis, a nearly bezel-free 16:10 touch display, and Intel’s newest 11th Gen processors.");
		out.println("["+lab2Crud.readLaptops()+"]");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String img = request.getParameter("img");
		String description = request.getParameter("description");
		lab2Crud.updateLaptops(new Laptops(title, img, description));
	}

}
