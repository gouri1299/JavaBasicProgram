package com.practice.collection;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) throws Exception {

		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add("hello");
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);

		ArrayList<Object> a2 = new ArrayList<>();

	     //a2.addAll(a1); //a2 mdhe a1 che elements add kele
		 //System.out.println("a2 mdhe add kele : "+a2);

		
		 // System.out.println(" before remove : "+a1); 
		 //a2.removeAll(a1);   //a2 mdhe a1 che elemnts addall ne add kelele te elements a2 mdhun remove kele
		 // System.out.println("after remove : "+a2);  //a2 print kela
		  
		 
		 // System.out.println(a1.contains(10));
		 // System.out.println(a1.containsAll(a2));
		 
		 //a2.retainAll(a1);

		 // System.out.println(a1.isEmpty());
		
       	 //System.out.println(a1.size());
		
		 //a1.clear();
		// System.out.println(a1.hashCode());
		 //System.out.println(a1.equals(a2));
		
	}

}
