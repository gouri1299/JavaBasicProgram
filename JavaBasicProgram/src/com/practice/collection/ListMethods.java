package com.practice.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
 
public class ListMethods {
	
	public static void main(String[] args) throws Exception {
			
			ArrayList al = new ArrayList();
			
			
			al.add("hello");
			al.add(20);
			al.add("hi");
			al.add(40);
			al.add("hi");
			al.add("hello");

			
			System.out.println(al);
			
			System.out.println(al.get(3));
			
//			al.set(0, "hiiiiii");
			
			System.out.println(al);
			
			System.out.println(al.indexOf(40));
			
			
			
		}

}
