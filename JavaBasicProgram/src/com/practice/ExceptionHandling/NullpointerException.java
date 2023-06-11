package com.practice.ExceptionHandling;

public class NullpointerException {

	public void m1()
	{
        System.out.println("inside m1");		
	}

	public static void main(String[] args) {
		 NullpointerException n=null;
		 n.m1();
	}
}
