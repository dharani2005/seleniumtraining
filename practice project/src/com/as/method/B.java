package com.as.method;

import java.util.Scanner;

public class B {
 static int m = 60;
	public void m2()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("this is m2 method in b class method package" +m);
	}
	public static void m3()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter value to print ");
        
		B obj = new B();
		obj.m2();
		System.out.println("this is m3 static method in b class method package " + m);
	}
	public static void main(String[] args) {
		/*B obj = new B();
	    obj.m2();	
	    B.m3();*/
		boolean condition=true;
		while(condition==true) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your name ");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("your name is : " + userName);  // Output user input
	
	    if(userName.equalsIgnoreCase("stop")) {
	    	condition=false;
	    }
		}
	}

}
