package com.practice.collection.sortedset;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{
	
	public int compare(Student std1, Student std2) {
		if (std1.marks > std2.marks) 
			return 1;
		else if (std1.marks < std2.marks) 
			return -1;
		else 

		return 0;
	}

}

	


