package com.abstraction.practice;

public class TestAtmImpl {

		public TestAtmImpl() {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			
			
			AtmImpl obj = new AtmImpl();
			
			boolean pinChanged = obj.changePin(10, 103);
			System.out.println("Pin changed : "+pinChanged);
			
			boolean result = obj.withdraw(123, 98765, 1200);
			System.out.println("Withdraw amount from ATM machine : "+result);
			
			int bal = obj.showBalance(123, 98765);
			System.out.println("Available Balance is : "+bal);
		}
		
}
