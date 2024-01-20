package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.model.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DaoImp implements DaoInterface{
	 static SessionFactory sf;
	static {
		sf=hibernateUtil.getMySessionFactory();
	}
	
	
	public boolean save(String empno, LocalDate startDate, LocalDate endDate, String lt, String lr) {
	
		XYZCompany obj =new XYZCompany(empno,startDate,endDate,lt,lr);
		
		Session s=sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(obj);
		tr.commit();
		s.close();
		
		return true;
	}


	@Override
	public List<XYZCompany> DisplayLeaveDetail(){
		Session s=sf.openSession();
		Transaction tr = s.beginTransaction();
		Query query=s.createQuery("from XYZCompany");
		List<XYZCompany> list=query.list();
		tr.commit();
		s.close();
	  return list;
	}

	

}
