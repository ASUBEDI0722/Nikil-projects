package com.ektha.bcj.practice;

public class Square implements Hello {

	public void show(int a) {

		System.out.println(a * a);
	}

	@Override
	public void show() {

		System.out.println("Hello World");
		
	}

}
