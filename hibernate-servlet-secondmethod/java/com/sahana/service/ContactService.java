package com.sahana.service;

import java.util.List;

import com.sahana.entity.ContactEntity;

public interface ContactService {
	public boolean validateAndSave(ContactEntity entity);
	
	public ContactEntity validateAndSearchByName(String username);
	
	public ContactEntity validateAndSearchByEmail(String email);
	
	public List<ContactEntity> getAll();

}
