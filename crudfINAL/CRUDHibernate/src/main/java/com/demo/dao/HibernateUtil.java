package com.demo.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   static SessionFactory sf;
  
  public static SessionFactory getConnection()  {
	  if(sf==null) {
		  sf=new Configuration().configure().buildSessionFactory();
	  }
	return sf;
  }
  
  public static void stopConnection() {
	  if(sf!=null) {
		  sf.close();
	  }
  }
}
