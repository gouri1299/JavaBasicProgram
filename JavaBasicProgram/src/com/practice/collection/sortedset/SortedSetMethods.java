package com.practice.collection.sortedset;

import java.util.TreeSet;

public class SortedSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		
	    System.out.println(ts);
	    
	    System.out.println(ts.first());
	    System.out.println(ts.last());
	
	    
	    TreeSet ts2 =(TreeSet) ts.headSet(30);
	    System.out.println(">>>>>>>>>>> HEADSET >>>>>>"+ts2);
	    
	    TreeSet ts3 = (TreeSet) ts.tailSet(30);
	    System.out.println(">>>>>>>>>>> TAILSET >>>>>>"+ts3);
	    
		TreeSet ts4 =(TreeSet) ts.subSet(20, 50);
		System.out.println(">>>>>>>>>>> SUBSET >>>>>>"+ts4);
	}

}
