package com.Sreekanth.SpringBoot.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Sreekanth.SpringBoot.entity.RegisterEntity;

@Repository
public class RegisterRepository {

	@Autowired
	private SessionFactory sessionfactory;
	
	public void saveDetails(RegisterEntity registerEntity) {
		try {
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
