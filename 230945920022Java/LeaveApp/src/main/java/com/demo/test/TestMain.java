package com.demo.test;

import java.util.Scanner;
import com.demo.model.*;
import com.demo.service.*;
import java.util.List;


public class TestMain {
  static Scanner sc;
  static {
	  sc=new Scanner(System.in);
  }
  
  public static void main(String[] args) {
	  ServiceInterface s=new ServiceImp();
	  
	  int choice=0;
	  
	  do {
		  System.out.println("1. Apply Leave");
		  System.out.println("2. View Leave History");
		  System.out.println("Enter Choice :");
		  choice=sc.nextInt();
		  switch(choice) {
		  case 1:
			  boolean flag=s.ApplyLeave();
			  if(flag==true) {
				  System.out.println("Leave Applied Succefully");
			  }else {
				  System.out.println("SomeThing Went Wrong");
			  }
			  break;
			  
		  case 2:
			  List<XYZCompany> list = s.displayAll();
			  list.forEach(System.out::println);
			  break;
			  
		  case 3:
			System.out.println("Thank You");
			sc.close();
			System.exit(0);
			  break;
		  }
	  }while(choice !=3);
	  
  }
	
}
