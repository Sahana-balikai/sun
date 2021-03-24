package com.sahana.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sahana.entity.ContactEntity;
import com.sahana.hibernate.util.SFUtil;

public class ContactDAOImpl implements ContactDAO{
	
	private SessionFactory factory=SFUtil.getFactory();
	 
	private List<ContactEntity> lists;
	
	public ContactDAOImpl() {
		System.out.println("default constructor");
	}

	@Override
	public void create(ContactEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("commit is success");
		}
		
	}

	@Override
	public void save(ContactEntity entity) {
		System.out.println("invoked save");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("commit is success");
		}
		
	}

	@Override
	public ContactEntity findByName(String username) {
		System.out.println("invoked findByName");
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			Query<ContactEntity> query=session.createQuery("select ctc from ContactEntity ctc where ctc.username=:name");
			query.setParameter("name", username);
			ContactEntity contactEntity=query.uniqueResult();
			transaction.commit();
			System.out.println("commit is success");
			return contactEntity;
		}
		
	}

	@Override
	public ContactEntity findByEmail(String email) {
		System.out.println("invoked findByEmail");
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			Query<ContactEntity> query=session.createQuery("select ctc from ContactEntity ctc where ctc.email=:email");
			query.setParameter("email", email);
			ContactEntity contactEntity=query.uniqueResult();
			transaction.commit();
			System.out.println("commit is success");
			return contactEntity;
		}
		
	}

	@Override
	public List<ContactEntity> findAll() {
		System.out.println("invoked find all method");
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			Query<ContactEntity> query=session.createQuery("select ctc from ContactEntity ctc" );
			List<ContactEntity> lists=query.getResultList();
			System.out.println("commit is success");
			return lists;
		}
	
	}
	
	
	

}
