package com.jwt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String customer_name = request.getParameter("name"); 
        String email = request.getParameter("email"); 
        String course = request.getParameter("course"); 
        String phno = request.getParameter("pno"); 
        String amount = request.getParameter("amount"); 
		out.println("<html>");
		out.println("<body>");
		out.println("Hello " + "  " + name + "welcome to my blog");
		out.println("Your password is : " + "  " + email + "<br>");
		out.println("</body></html>");
	}
}