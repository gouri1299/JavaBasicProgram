package com.practice.ExceptionHandling;

public class ExceptionDemo{
   
	public static void main(String[] args) {
		
	
	try
	{
		int i=10;
		System.out.println("inside try");
		int res=10/0;
		System.exit(0);
		System.out.println("inside try 2");
		System.out.println("inside try 3");
	}
	catch(Exception e)
	{
		System.out.println("inside catch");
	}
	finally
	{
		System.out.println("inside finally");
	}
	System.out.println("m1 ended");
    }


}