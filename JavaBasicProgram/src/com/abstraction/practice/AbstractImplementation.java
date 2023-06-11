package com.abstraction.practice;

public class AbstractImplementation {
	
	public void print() {
		System.out.println("inside print method!!");
	}
	
	public static void main(String[] args) {
		
		AbstractImplementation ab = new AbstractImplementation();
		ab.print();
		//ab.printHello();
	}

}
