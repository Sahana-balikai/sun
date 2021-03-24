package com.sahana.dao;

import java.util.List;

import com.sahana.entity.ContactEntity;

public interface ContactDAO {
	public void create(ContactEntity entity);

	public void save(ContactEntity entity);
	
	public ContactEntity findByName(String username);
	
	public ContactEntity findByEmail(String email);
	
	public List<ContactEntity> findAll();
}
