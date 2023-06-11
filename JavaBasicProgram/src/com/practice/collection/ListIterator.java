package com.practice.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListIterator {
	
	public static void main(String[] args) throws Exception {
			
			
			ArrayList al = new ArrayList();
			
			al.add("hello");
			al.add(20);
			al.add("hi");
			al.add(40);
			al.add("hi");
			al.add("world");

			ListIterator ltr = (ListIterator) al.listIterator(6);
			
			while(ltr.hasPrevious())
			{
				System.out.println(ltr.hasPrevious());
				
				al.add("rrr");
			}
			
			
		}

	private boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
