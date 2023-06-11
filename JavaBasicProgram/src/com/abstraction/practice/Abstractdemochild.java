package com.abstraction.practice;

public class Abstractdemochild extends Abstractdemo  { 
	
	void m1() {
		System.out.println("hiii....");
	}

	public static void main(String[] args) {
		
        Abstractdemochild c = new Abstractdemochild();
        c.m1();
	}

}
