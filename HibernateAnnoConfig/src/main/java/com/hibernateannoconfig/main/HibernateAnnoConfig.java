package com.hibernateannoconfig.main;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernateannoconfig.model.Laptop;
import com.hibernateannoconfig.model.Student;

public class HibernateAnnoConfig {
	
	public static void main(String[] args) {
		
		//short time notation
		Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		
//		//StandardServiceRegistry build = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
//		
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		List<Laptop> laptop = new LinkedList<Laptop>();
		laptop.add(new Laptop("ASUS","i5"));
		laptop.add(new Laptop("Dell","i3"));
		laptop.add(new Laptop("Hp","i7"));
		
		Student student = new Student("Samba","Shivudu","Warangal");
		student.setLaptaop(laptop);
		
		session.save(student);
		System.out.println("Success");
		
		txn.commit();
		
		
	}

}
