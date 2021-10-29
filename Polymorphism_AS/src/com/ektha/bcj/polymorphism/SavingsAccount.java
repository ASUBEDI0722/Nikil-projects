package com.ektha.bcj.polymorphism;

public class SavingsAccount {

	public int withdrawAmount(int balance, int withdrawAmount) {

		int serviceFee = 5;

		int remainingBalance = balance - withdrawAmount - serviceFee;

		System.out.println(remainingBalance);
		return remainingBalance;

	}

}
