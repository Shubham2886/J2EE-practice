package com.hibernate.test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.met.model.Account;



public class HibernateTest {

		private static SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
		
		private static void saveUsingHibernate(Account account) {
			Transaction tx = null;
			
			try(Session session = sessionFactory.openSession()){
				
				tx = session.beginTransaction();
				
				Serializable accId = session.save(account);
				
				System.out.println("Acc id" +accId);
				tx.commit();
			}catch(HibernateException e) {
				if(tx!= null)
					tx.rollback();
				e.printStackTrace();
			}
			
			System.out.println("Here");
			System.out.println("Account saves successfully");
		}
		
		public static void main(String[] args) {
			Account account = new Account();
			account.setId(10);
			account.setName("asdasf");
			account.setBalance(85000);
			
			saveUsingHibernate(account);
			
			sessionFactory.close();
		}
}
