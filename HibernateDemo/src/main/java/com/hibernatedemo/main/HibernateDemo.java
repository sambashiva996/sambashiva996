package com.hibernatedemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.Employee;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		 Session session = sessionFactory.openSession();
		//Transaction txn = session.beginTransaction();
		// Employee emp = new Employee(23, "Samba", "Shivudu", "Warangal", "sambashiva996@gmail.com");
		// session.save(emp);
		// txn.commit();
		 Employee emp = (Employee) session.get(Employee.class, 1);
		 System.out.println(emp);
		 System.out.println("Success");
	}

}
