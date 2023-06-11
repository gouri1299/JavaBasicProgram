package com.practice.ExceptionHandling;

public class CustomException {
	
   
 public static void main(String[] args) {
	
	 boolean res = vote(17,"ram", "india");
	 
}

private static boolean vote(int age, String name, String country) {
	boolean res= false;
	if (age > 18)
	{
		System.out.println("valid voter");
		res= true;
	}
	else
	{
		System.out.println("invalid voter");
		throw new InvalidAgeException("age is not appropriate");
	}
	return res;
}

   
}
