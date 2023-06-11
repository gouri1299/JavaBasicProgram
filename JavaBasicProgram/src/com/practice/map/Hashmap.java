package com.practice.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 =new HashMap();
	    System.out.println (h1.put("gouri", 1)); 
	    h1.put("xyz", 2);
	    h1.put("pqr", 3);
	    h1.put("abc", 4);
	    h1.put("std", 5);
	    h1.put("stg", 6);
	    h1.put("srdfgv", 7);
	    h1.put("srgrse", 8);
	    
		/*
		 * Set<String> setOfKeySet = h1.keySet(); Iterator<String> itr =
		 * setOfKeySet.iterator();
		 * 
		 * h1.values();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next());
		 * 
		 * }
		 */
	    
		/*
		 * Set<Map.Entry<String, Integer>> setOfEntry = h1.entrySet();
		 * Iterator<Map.Entry<String , Integer>> itr =setOfEntry.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next());
		 * 
		 * }
		 */
	    
   	     Collection<Integer> values = h1.values(); Iterator<Integer> itr =
	   	 values.iterator();
	   		  
	  	  h1.values();
	   		  
 		  while (itr.hasNext()) { System.out.println(itr.next());
	   		  
	   		  }

	    
	}

}