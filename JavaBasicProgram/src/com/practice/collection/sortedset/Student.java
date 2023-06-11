package com.practice.collection.sortedset;

public class Student {
	int roll_no;
	String name;
	int marks;
	
	public Student() {
		super();
	}
	
	public Student(int roll_no, String name, int marks) {
		super();
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "Student[roll_no =" + roll_no +" , name = " + name + " marks =" + marks + "]";
	}
		

}
