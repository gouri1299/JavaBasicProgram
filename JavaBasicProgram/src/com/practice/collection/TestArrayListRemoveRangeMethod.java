package com.practice.collection;

import java.util.ArrayList;

public class TestArrayListRemoveRangeMethod extends ArrayList {
	
	public static void main(String[] args) {
		
		TestArrayListRemoveRangeMethod Rr = new TestArrayListRemoveRangeMethod();
		
		Rr.add(40);  //0
		Rr.add(50);  //1
		Rr.add(60);  //2
		Rr.add(70);  //3
		Rr.add(80);  //4
		Rr.add(90);  //5
		
		System.out.println(Rr);
		
		System.out.println("removing elements with range");
		
		Rr.removeRange(2,3);
		
		System.out.println(Rr);
		
		
		
	}

}
