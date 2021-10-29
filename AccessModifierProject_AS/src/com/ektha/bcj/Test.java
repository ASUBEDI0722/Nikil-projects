package com.ektha.bcj;

public class Test {

	public static void main(String[] args) {

		TestDefault employee = new TestDefault();
		employee.getEmployeeInfo();
		
		demo();

	}

	public static int addNumber(int a, int b) {

		int sum = a + b;
		return sum;
	}

	private static void demo() {

		System.out.println("Welcome to boot camp java.");
	}

	protected void printHello() {

		System.out.println("Hello World");
	}

}
