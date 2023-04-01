package day2;
//Wap to ask name ,age and salary of an employee and display it
//import java.lang.*;  --> default package 

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		//String is predefined class 
		// java.lang.String
		String name;
		int age;
		float salary;
		Scanner s= new Scanner(System.in);
		System.out.println("enter name ");
		name= s.next();
		System.out.println("enter age ");
		age= s.nextInt();
		System.out.println("enter salary ");
		salary=s.nextFloat();
		
		System.out.println("name="+ name);
		System.out.println("age="+ age);
		System.out.println("salary="+ salary);
		
		
		

	}

}
