package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Books;

public class daoImp implements DaoInterface{
  static SessionFactory sf;
  static {
	  sf=HibernateUtil.getConnection();
  }
@Override
public void addBook(Books b) {
	Session s=sf.openSession();
	Transaction tr = s.beginTransaction();
	s.save(b);
	tr.commit();
	s.close();
}
@Override
public List<Books> DisplayAll() {
	List<Books> list=new ArrayList<>();
	Session s=sf.openSession();
	Transaction tr = s.beginTransaction();
	Query query=s.createQuery("From Books");
	list=query.list();
	tr.commit();
	s.close();
	return list;
}
@Override
public Books getById(int id) {
	Session s=sf.openSession();
	Transaction tr = s.beginTransaction();
	Books b=s.get(Books.class, id);
	tr.commit();
	s.close();
	return b;
}
@Override
public Books Update(Books b) {
	Session s=sf.openSession();
	Transaction tr = s.beginTransaction();
	Books b1=s.get(Books.class, b.getBid());
	//System.out.println(b1);
	
	b1.setBname(b.getBname());
	b1.setCost(b.getCost());
	b1.setType(b.getType());
	tr.commit();
	s.close();
	return b1;
}

	
	
	

}
