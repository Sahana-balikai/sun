package com.sahana.service;

import java.util.List;

import com.sahana.dao.ContactDAO;
import com.sahana.dao.ContactDAOImpl;
import com.sahana.entity.ContactEntity;

public class ContactServiceImpl implements ContactService {

	@Override
	public boolean validateAndSave(ContactEntity entity) {
		System.out.println("invoked validate and save method");
		ContactEntity contactEntity = entity;
		boolean validData = false;
		if (contactEntity != null) {
			System.out.println("entity is nnot null,can save fields");
			String username = contactEntity.getUsername();
			if (username != null && username.length() >= 3 && !username.isEmpty()) {
				System.out.println("username is valid");
				validData = true;
			} else {
				System.out.println("username is invalid");
				validData = false;
			}
			if (validData) {
				String email = contactEntity.getEmail();
				if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
					System.out.println("email is valid");
					validData = true;
				} else {
					System.out.println("email is invalid");
					validData = false;
				}
			}

			if (validData) {
				String phoneNo = contactEntity.getPhoneNo();
				if (phoneNo != null && phoneNo.length() == 10 && !phoneNo.isEmpty()) {
					System.out.println("phone number is valid");
					validData = true;
				} else {
					System.out.println("phone number is invalid");
					validData = false;
				}
			}

			if (validData) {
				String TellusaboutYourProject = contactEntity.getTellusaboutYourProject();
				if (TellusaboutYourProject != null && !TellusaboutYourProject.isEmpty()) {
					System.out.println("TellusaboutYourProject is valid");
					validData = true;
				} else {
					System.out.println("TellusaboutYourProject is invalid");
					validData = false;
				}
			}

			if (validData) {
				System.out.println("all data valid");
				ContactDAO dao=new ContactDAOImpl();
				dao.save(contactEntity);
			} else {
				System.out.println("data is invalid");
			}

		}

		return validData;
	}

	@Override
	public ContactEntity validateAndSearchByName(String username) {
		System.out.println("invoked validateAndSearchByName");
		if(username!=null && !username.isEmpty() && username.length()>3 && username.length()<20) {
			System.out.println("name is valid,can search");
			ContactDAO dao=new ContactDAOImpl();
			ContactEntity entity=dao.findByName(username);
			System.out.println("contact entity " +entity);
			return entity;
			
		}
		return null;
	}

	@Override
	public ContactEntity validateAndSearchByEmail(String email) {
		System.out.println("invoked validateAndSearchByEmail");
		if(email!=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
			System.out.println("email is valid,can search");
			ContactDAO dao=new ContactDAOImpl();
			ContactEntity entity=dao.findByEmail(email);
			System.out.println("Contact entity" +entity);
			return entity;
		}
		return null;
	}

	@Override
	public List<ContactEntity> getAll() {
		System.out.println("invoked getAll from Service");
		ContactDAO dao=new ContactDAOImpl();
		List<ContactEntity> entity=dao.findAll();
		return entity;
	}

}
