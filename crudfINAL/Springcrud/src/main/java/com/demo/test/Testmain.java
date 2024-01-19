package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Books;
import com.demo.service.ServiceInterface;

public class Testmain {
static Scanner sc;
static {
	sc=new Scanner(System.in);
}
	public static void main(String[] args) {
	  ApplicationContext cfx = new ClassPathXmlApplicationContext("springconfig.xml");
	  
	  ServiceInterface s = (ServiceInterface)cfx.getBean("serviceImp");
	  
	  
	  
	  int choice=0;
	  
	  do {
		  System.out.println("1. Add new Book");
		  System.out.println("2. Display All");
		  System.out.println("3. Display By Id");
		  System.out.println("4. Delet by Id");
		  System.out.println("5. Update");
		  
		  choice=sc.nextInt();
		  
		  switch(choice) {
		  case 1:
			  s.AddNewBook();
			  break;
			  
		  case 2:
			 List<Books> list= s.DisplayAll();
			 list.forEach(System.out::println);
			  break;
			  
		  case 3:
			 Books b= s.DisplayById();
			 System.out.println(b);
			  break;
			  
		  case 4:
			  break;
			  
		  case 5:
			  break;
			  
		  case 6:
			  System.out.println("Thank You");
			  sc.close();
			  System.exit(0);
			  break;
			  
			  default :
				  System.out.println("Wrong Choice");
				  break;
		  }
		  
	  }while(choice!=6);
	}

}
