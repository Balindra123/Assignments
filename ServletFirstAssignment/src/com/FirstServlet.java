package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FirstServlet", "/support" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String supportEmail;
    int ticketId;
	
	public void init(ServletConfig config) throws ServletException {
		supportEmail = config.getInitParameter("support-email");
        Random random = new Random();
        ticketId = random.nextInt(100000) + 1;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        out.print("<html><head><title>Test</title></head><body>");
	        out.print("<form method='post'>");

	        out.print("<input type='text' name = 'name' placeholder='Enter Name'/></br>");
	        out.print("<input type='text' name='email' placeholder='Enter Email'/></br>");
	        out.print("<input type='text' placeholder='Enter Problem'/></br>");
	        out.print("<textarea rows='4' cols= '20' placeholder='Describe Problem'></textarea></br>");

	        out.print("<input type='submit' value='Help'/>");

	        out.print("</form>");
	        out.print("</body></html>");
	}

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.getWriter().println("Thank you! "+request.getParameter("name")+ " for contacting us. We should receive reply from us with in 24 hrs in your email address " +request.getParameter("email") +". Let us know in our support email " +supportEmail+" if you do not receive reply within 24 hrs. Please be sure to attach your reference "+ticketId + " in your email.");
	 }
	


}
