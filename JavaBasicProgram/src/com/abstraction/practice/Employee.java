package com.abstraction.practice;

public class Employee extends Person {

			public boolean isValidAge() {
				if(this.age >= 18)
					return true;
				else
					return false;
			}

			public Employee()
			{
				
			}
			public Employee(String name, float height, int weight, int age)
			{
				super(name, height, weight, age); //but we can invoke abstract class constructor through child class constructor
			}
			
			
			
			public static void main(String[] args) {
				
//				Person p = new Person();  //can not create object of abstract class
//				Person p = new Employee("Ram",6.7f, 67,17); 
//				Employee emp = new Employee();
				Employee emp = new Employee("Ram",6.7f, 67,17); 
				
				emp.printPersonInfo();
				System.out.println(emp.isValidAge());
				
				
			}
			

}
