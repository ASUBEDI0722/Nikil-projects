package com.ektha.bcj;

//method-overriding
public class Test {

	public static void main(String[] args) {

		Phone phone = new IPhone();
		
		System.out.println(phone.getMessage());

	}

}
