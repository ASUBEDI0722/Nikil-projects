package com.ektha.bcj.array;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");

		int number = scanner.nextInt();
		
		printFactorial(number);
		
	}
	
	public static void printFactorial(int number) {
		
		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);

	}

}
