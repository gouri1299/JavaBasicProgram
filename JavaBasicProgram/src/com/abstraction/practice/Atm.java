package com.abstraction.practice;

public abstract class Atm {

		public Atm() {
			
		}

		public boolean withdraw(int pin, int accNo, int enteredAmount)
		{
			//if pin is valid --> isValidPin(pin);
			//if account is valid --> isValidAcc(accNo);
			//fetch current balance from acc --> currentBal
			int currentBal = 2000;
			if(enteredAmount <= 10000 && enteredAmount <= currentBal)
				return true;
			else
				return false;
		}
		
		public abstract boolean changePin(int oldPin, int newPin);
		
		public int showBalance(int pin, int accNo)
		{
			//if pin is valid --> isValidPin(pin);
			//if account is valid --> isValidAcc(accNo);
			//fetch current balance from acc --> currentBal
			int currentBal = 3456;
			return currentBal;
		}
		
}
