package com.as.cls;

public class A {

	int x = 10;
	int y = 20;
	int z = x+y;
public static void m1()

{
	A obj = new A();

   System.out.println("this is z value:" + obj. z);
	}
public void m2()
{
	m1();


	
	System.out.println("this is m2 instance method in A class cls pakage " + z);
	}
   public  void m3()
   {
   System.out.println("this is m3 method");
   }
   
   
	public static void main(String[] args) {
		
     A obj = new A();
    A.m1();
    obj.m2();
	}

}
