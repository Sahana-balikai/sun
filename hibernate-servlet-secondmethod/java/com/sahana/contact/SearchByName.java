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

public class SearchByName extends HttpServlet{
	
	private ContactService service=null;
	
	public SearchByName() {
		System.out.println("invoked searchByName Servlet" +this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init();
		this.service=new ContactServiceImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost from SearchByName");
		String name=req.getParameter("name");
		System.out.println("name from req:" +name);
		ContactEntity entity=this.service.validateAndSearchByName(name);
		System.out.println(entity+"from service");
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		
		writer.println("<h1>Search By Email</h1>");
		
		writer.println("<form action=\"SearchByNameAction\" method=\"post\">\r\n" + 
				"Search By Name <input type=\"text\" name=\"name\"/> \r\n" + 
				"<input type=\"submit\" value=\"Search\">\r\n" + 
				"</form>");
		
		if(entity!=null) {
			writer.println("<p>Search results found </br>" +entity.getUsername()+ "</p");
			
		}
		else {
			writer.println("</body>");
			writer.println("</html>");
		}
	}

}
