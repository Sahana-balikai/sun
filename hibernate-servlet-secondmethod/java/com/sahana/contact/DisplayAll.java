package com.sahana.contact;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahana.entity.ContactEntity;
import com.sahana.service.ContactService;
import com.sahana.service.ContactServiceImpl;

public class DisplayAll extends HttpServlet{
	
	private ContactService service;
	
	public DisplayAll() {
		System.out.println("created displayAll" +this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.service=new ContactServiceImpl();
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet from DisplayAll");
		List<ContactEntity> listFromService=this.service.getAll();
		System.out.println(listFromService);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		if(listFromService!=null && !listFromService.isEmpty()) {
			System.out.println("list is found with size" +listFromService.size());
			writer.println("<h1>Results found,Total: " +listFromService.size()+ "</h1>");
			writer.println("<table border='1'>");
			
			Iterator<ContactEntity> iterator=listFromService.iterator();
			while(iterator.hasNext()) {
				ContactEntity ele=iterator.next();
				writer.println("<tr>");
				writer.println("<td>" +ele.getId()+ "</td>");
				writer.println("<td>" +ele.getUsername()+ "</td>");
				writer.println("<td>" +ele.getEmail()+ "</td>");
				writer.println("<td>" +ele.getPhoneNo()+ "</td>");
				writer.println("<td>" +ele.getTellusaboutYourProject()+ "</td>");
				writer.println("</tr>");
			}
			writer.println("</table>");
		}else {
			System.out.println("list is empty");
			writer.println("<h1>Results not Found</h1>");
		}
		writer.println("</body>");
		writer.println("</html>");

	}

}
