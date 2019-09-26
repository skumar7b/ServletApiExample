package com;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginCtrl
 */
public class LoginCtrl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	ServletConfig sc=getServletConfig();
	String e=sc.getInitParameter("email");
		
	ServletContext scx= getServletContext();
	String site=scx.getInitParameter("site");
	
	
	System.out.println(e);
	System.out.println(site);
	response.sendRedirect("page.html");
	}
}