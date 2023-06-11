package com.practice.collection.sortedset;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	
	public int compare(Student std1, Student std2) {
		
		return std1.name.compareTo(std2.name);
	}
	

}
