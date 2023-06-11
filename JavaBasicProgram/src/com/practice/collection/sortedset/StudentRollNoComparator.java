package com.practice.collection.sortedset;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {
	
	public int compare(Student std1, Student std2) {
		
		if (std1.roll_no > std2.roll_no)
			return 1;
		else if (std1.roll_no < std2.roll_no) 
			return -1;
		else 
			return 0;
		
	}

}
