package com.sahana.contact;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahana.entity.ContactEntity;
import com.sahana.service.ContactService;
import com.sahana.service.ContactServiceImpl;

public class SearchByEmail extends HttpServlet{
	
	private ContactService service;
	
	public SearchByEmail() {
		System.out.println("created SearchByEmail");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service=new ContactServiceImpl();
		super.init(config);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost from SearchByEmail");
		String email=req.getParameter("email");
		System.out.println("email from req :" +email);
		ContactEntity entityFromService=this.service.validateAndSearchByEmail(email);
		System.out.println("entityFromService :" +entityFromService);
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		
		writer.println("<h1>Search By Email</h1>");
		
		writer.println("<form action=\"SearchByEmailAction\" method=\"post\">\r\n" + 
				"Search By Name <input type=\"text\" name=\"email\"/> \r\n" + 
				"<input type=\"submit\" value=\"Search\">\r\n" + 
				"</form>");
		
		if(entityFromService!=null) {
			writer.println("<p>Search results found </br>" +entityFromService.getEmail()+ "</p");
			
		}
		else {
			writer.println("<p style='color:red;'>No Results Found</p>");
		}
		
		writer.println("</body>");
		writer.println("</html>");

	}
	

}
