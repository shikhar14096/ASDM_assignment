package day8_class;

import java.util.Scanner;

public class SellerDetails {
	String sname;
	String email;
	int regno;
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter seller name");
		sname=s.next();
		System.out.println("enter email");
	
		email=s.next();
		System.out.println("enter regno");
		regno=s.nextInt();			
	}
	void display()
	{
		System.out.println(sname +"  "+ email +"  "+ regno);
	}
	 

}
