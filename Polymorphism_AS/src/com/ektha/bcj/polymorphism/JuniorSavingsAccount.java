package com.ektha.bcj.polymorphism;

public class JuniorSavingsAccount extends SavingsAccount {
	
public int withdrawAmount (int balance, int withdrawAmount) {
		
		int remainingBalance = balance - withdrawAmount;
		
		System.out.println(remainingBalance);
		return remainingBalance;
		
	}

}
