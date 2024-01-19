package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.demo.service.*;
import com.demo.model.*;
public class TestMain {
  static Scanner sc;
  static {
	  sc=new Scanner(System.in);
  }
  public static void main(String[] args) {
	  ServiceInterface s = new ServiceImp();
	  
	  int choice =0;
	  
	  do {
		  System.out.println("1. Add new Book");
		  System.out.println("2. Display All");
		  System.out.println("3. Display by Id");
		  System.out.println("4. Update by Id");
		  System.out.println("5. Sort by cost");
		  System.out.println("6. Delete by Id");
		  
		  choice=sc.nextInt();
		  
		  switch(choice) {
		  case 1:
			  s.AddData();
			  break;
		  case 2:
			  List<Books>list=s.DisplayAll();
			  list.forEach(System.out::println);
			  break;
		  case 3:
			  Books b=s.DisplayById();
			  System.out.println(b);
			  break;
		  case 4:
			  s.Update();
			  break;
		  case 5:
			  break;
		  case 6:
			  break;
		  case 7:
			  System.out.println("Thank You...");
			  sc.close();
			  System.exit(0);
			  break;
			  
			  default:
				  System.out.println("Wrong Choice");
			  break;
			  
		  }
	  }while(choice!=7);
  }
}
