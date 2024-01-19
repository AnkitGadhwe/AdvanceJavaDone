package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DaoInterface;
import com.demo.model.Books;

@Service
public class ServiceImp implements ServiceInterface{
static Scanner sc;
static {
	sc=new Scanner(System.in);
}
	
	@Autowired
 private DaoInterface d;

	
	
	@Override
	public void AddNewBook() {
		System.out.println("Enter Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book name");
		String name=sc.nextLine();
		System.out.println("Enter Book Type");
		String type=sc.nextLine();
		System.out.println("Enter Book cost");
		int cost=sc.nextInt();
		Books b = new Books(id,name,type,cost);
		d.AddnewBook(b);
	}



	@Override
	public List<Books> DisplayAll() {
	
		return d.displayAll();
	}



	@Override
	public Books DisplayById() {
		System.out.println("Enter Id");
		int id=sc.nextInt();
		
		return d.DisplayById(id);
	}



	
	
	
}
