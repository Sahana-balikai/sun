package com.sahana.contact;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sahana.dao.ContactDAO;
import com.sahana.dao.ContactDAOImpl;
import com.sahana.entity.ContactEntity;
import com.sahana.service.ContactService;
import com.sahana.service.ContactServiceImpl;

public class ContactPage extends HttpServlet {

	public ContactPage() {
		System.out.println("invoked the contact page" + this.getClass().getSimpleName());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("phoneNo");
		String date = req.getParameter("date");
		
		String TellusaboutYourProject = req.getParameter("TellusaboutYourProject");
		// System.out.println(Company);
		System.out.println(username);
		System.out.println(email);
		System.out.println(phoneNo);
		// System.out.println(date);
		System.out.println(TellusaboutYourProject);
		ContactEntity entity = new ContactEntity();
		entity.setUsername(username);
		entity.setEmail(email);
		entity.setPhoneNo(phoneNo);
		entity.setTellusaboutYourProject("Cybernetic");

		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Contact us");
		writer.println("</h1>");
		writer.println("<h3>");
		writer.println("Thank You " + username);
		

		//ContactDAO dao = new ContactDAOImpl();
		//dao.create(entity);

		ContactService service = new ContactServiceImpl();
		boolean saved = service.validateAndSave(entity);
		
		if (saved) {
			System.out.println("data saved successfully");
			writer.println("Contact details saved for username" + username);
		} else {
			System.out.println("data saved failed");
			writer.println("contact details not saved for username" + username);
		}
		writer.println("</h3>");
		writer.println("</body>");
		writer.println("</html>");
	}
}
