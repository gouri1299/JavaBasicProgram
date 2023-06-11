package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

	public class IteratorPractice {
		
		public static void main(String[] args) throws Exception {
			
			
			ArrayList al = new ArrayList();
			
			al.add("hello");
			al.add(20);
			al.add("hi");
			al.add(40);
			al.add("hi");
			al.add("hello");

			
			Iterator itr = al.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
	            if(itr.next().equals(20));
    			al.set(0, "Helllooo gouri"); //replaced element
//   			al.add(50);
//				al.remove(1);
//				if(itr.next().equals(40))
//				itr.remove();
			}
			
			System.out.println(al);

		}

		
		
		  private boolean hasNext() {
			return false;
			  // TODO Auto-generated method stub return false;
		  }
		 
		 
}
