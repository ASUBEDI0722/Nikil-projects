package com.ektha.app;

public class DemoSingleton {

	public static void main(String[] args) {

		Demo demo1 = Demo.getInstance();	//lazy instantiation
	}

}

class Demo {

	private static Demo demo;//Step 1

	private Demo() { // Step 2

	}

	public static Demo getInstance() { // Step 3

		if (demo == null) {
			demo = new Demo();
			System.out.println("HelloWorld");
		}
		System.out.println("Hello");
		return demo;
	}

}
