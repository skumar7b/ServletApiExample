package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
 
public class MyServlet extends HttpServlet {

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>Hello, this servlet is Executed after the filter! Check the logs</title></head>");
      out.println("<body>");
      out.println("<h1>This servlet is invoked after the filter!</h1>"); 
      out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
      out.println("<p>Protocol: " + request.getProtocol() + "</p>");
      out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
      out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
      out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
      out.println("</body></html>");
      out.close();  
   }
}