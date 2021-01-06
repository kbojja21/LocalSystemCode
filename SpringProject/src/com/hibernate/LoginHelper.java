package com.hibernate;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.model.Registration;

public class LoginHelper {
	static Logger log=Logger.getLogger("spring");
	public boolean validate(SessionFactory factory, String email, String password) {
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in validate method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			customer_login result = (customer_login) session.get(customer_login.class, email);
			System.out.println(result);
			if (result != null && result.getPassword().equals(password))
				return true;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	public int insertUser(SessionFactory factory,String signupName,String signupEmail,
			String signupNewPassword ,String gender,String date,String security,String signupsecurityanswer)
		{
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in insertUser method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			customer_login client=new customer_login();
//		String name=register.getSignupName();
//		String email=register.getSignupEmail();
//		String password=register.getSignupNewPassword();
//		String sex=register.getGender();
//		String birth=register.getDate();
//		String securityquestion=register.getSecurity();
//		String securityanswer=register.getSignupsecurityanswer();
			client.setName(signupName);
			client.setEmail(signupEmail);
			client.setPassword(signupNewPassword);
			client.setSex(gender);
			client.setBirth(date);
			client.setSecurityquestion(security);
			client.setSecurityanswer(signupsecurityanswer);
			session.save(client);
			log.info("object in hibernate"+client);
			System.out.println("result:"+client);
			tx.commit();
			if(client!=null)
				return 1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
		}
	public boolean emailCheck(SessionFactory factory, String email) {
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in emailCheck method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			customer_login result = (customer_login) session.get(customer_login.class, email);
			System.out.println(result);
			if (result != null)
				return true;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	public String emailSecurity(SessionFactory factory, String email) {
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in emailSecurity method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			customer_login result = (customer_login) session.get(customer_login.class, email);//select * from customer_login where email=email;
			System.out.println(result);
			if (result != null)
			{
				String question=result.getSecurityquestion();
				return question;
			}
			else 
				return null;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public boolean answerCheck(SessionFactory factory, String email, String answer) {
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in answerCheck method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			customer_login result = (customer_login) session.get(customer_login.class, email);
			System.out.println(result);
			if (result != null && result.getSecurityanswer().equalsIgnoreCase(answer))
				return true;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	
	public int passwordInsert(SessionFactory factory,String email,String password)
		{
		Session session = factory.openSession();
		Transaction tx = null;
		log.info("successful entry in passwordInsert method from class LoginHelper");
		try {
			tx = session.beginTransaction();
			//customer_login client=new customer_login();
			customer_login result = (customer_login) session.get(customer_login.class, email);
			result.setPassword(password);
			
			session.save(result);
			log.info("object in hibernate"+result);
			System.out.println("result:"+result);
			tx.commit();
			if(result!=null)
				return 1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return 0;
		}
}
