package com.hibernateannoconfig.main;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.hibernateannoconfig.model.Answer;
import com.hibernateannoconfig.model.Question;

public class QuestionMain {
	
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

Transaction txn = session.beginTransaction();

Question question = new Question();
         question.setqName("What is Java?");
         
Answer answer = new Answer();
         answer.setAname("Java is a Object Oriented Programming Language");
         answer.setaPostedBy("Samba");
         
Answer answer1 = new Answer();
         answer1.setAname("is a Programming Language");
         answer1.setaPostedBy("Shivudu");
         
         List<Answer> listOfAnswer = new LinkedList<Answer>();

		listOfAnswer.add(answer);
		listOfAnswer.add(answer1);
		question.setAnswer(listOfAnswer);
		
		session.save(question);
		txn.commit();
		
		
	}

}
