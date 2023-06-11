package com.practice.ExceptionHandling;

	public class ExceptionDemo2 {
		
		public static void main(String[] args) {
			
			System.out.println("main method started!!");
			
			int res = 0;
			int denom = 0;
			int[] nums = {10,20,30};
			
			try
			{
				res = nums[4]/denom;
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println(">>>>> IndexOutOfBoundsException occurred!!");
			}
			catch(ArithmeticException e)
			{
				System.out.println(">>>>> ArithmeticException occurred!!");
			}
			
			System.out.println("Result is : "+res);
			
			System.out.println("main method ended!!");
			
		}


	
}
