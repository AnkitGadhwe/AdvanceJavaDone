package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.DaoImp;
import com.demo.dao.DaoInterface;
import com.demo.model.XYZCompany;

public class ServiceImp implements ServiceInterface{
    static Scanner sc;
    static {
    	sc=new Scanner(System.in);
    }
	private DaoInterface d;
    
    public ServiceImp() {
    	d=new DaoImp();
    }
	public boolean ApplyLeave() {
		System.out.println("Enter Employee no");
		String empno=sc.next();
		System.out.print("Enter a start date (yyyy/mm/dd): "); 
		String sd=sc.next();
		System.out.print("Enter a end date (yyyy/mm/dd): "); 
		String ed=sc.next();
		System.out.println("Enter Leave Type");
		String lt=sc.next();
		System.out.println("Enter Leave Reason");
		String lr=sc.next();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate startDate = LocalDate.parse(sd, formatter);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate endDate = LocalDate.parse(ed, formatter1);
  
	   boolean flag=d.save(empno,startDate,endDate,lt,lr);
	   if(flag==true) {
		   return true;
	   }
		return false;
	}
	@Override
	public List<XYZCompany> displayAll() {
	
		return d.DisplayLeaveDetail();
	}

}
