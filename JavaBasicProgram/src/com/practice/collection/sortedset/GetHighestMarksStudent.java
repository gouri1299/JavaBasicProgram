package com.practice.collection.sortedset;

import java.util.Comparator;
import java.util.TreeSet;

public class GetHighestMarksStudent {

	public static void main(String[] args) {
		
		Student std1 = new Student(10,"Gouri",68);
		Student std2 = new Student(15,"Rushi",99);
		Student std3 = new Student(19,"vaibhav",75);
		
		
//		TreeSet ts = new TreeSet<>(new StudentNameComparator());
//	    TreeSet ts = new TreeSet<>(new StudentRollNoComparator());
		TreeSet ts = new TreeSet<>(new StudentMarksComparator());
		
		
		ts.add(std1);
		ts.add(std2);
		ts.add(std3);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		
		System.out.println("Highest Marks Student :" + getSecondHighestMarksStudent(ts));
		
			
	}
	public static Student getHighestMarksStudent(TreeSet t)
	{
		Comparator cmp = t.comparator();
		if( cmp instanceof StudentMarksComparator)
			return (Student) t.last();
		else
			return null;
	}
	
	public static Student getSecondHighestMarksStudent (TreeSet t) 
	{
		Comparator cmp = t.comparator();
		if(cmp instanceof StudentMarksComparator)
			return (Student)t.lower(t.last());	 
		else 
			return null;
	}
}


