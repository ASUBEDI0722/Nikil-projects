package com.ektha.design.lazy;

public class SingletonDemo {

	public static void main(String[] args) {

//		Abc obj1 = Abc.getInstance();
//		obj1.addNumber();
//		obj1.addNumber();
//		obj1.addNumber();
//		System.out.println(obj1.returnNumber());
//		
//		Abc obj2 = Abc.getInstance();
//		obj2.addNumber();
//		obj2.addNumber();
//		obj2.addNumber();
//		System.out.println(obj2.returnNumber());
////		
//		System.out.println(obj1.returnNumber());

		CDE obj3 = new CDE();
		obj3.addNumber();
		obj3.addNumber();
		obj3.addNumber();
		System.out.println(obj3.returnNumber());

		CDE obj4 = new CDE();
		obj4.addNumber();
		obj4.addNumber();
		obj4.addNumber();
		System.out.println(obj4.returnNumber());
		System.out.println(obj3.returnNumber());

	}

}

class CDE {
	int number = 0;

	public void addNumber() {
		++number;
	}

	public int returnNumber() {
		return number;
	}

}

//class Abc {
//
//	static Abc obj = new Abc();
//
//	int number = 0;
//
//	private Abc() {
//
//	}
//
//	public static Abc getInstance() {
//		return obj;
//	}
//
//	public void addNumber() {
//		++number;
//	}
//
//	public int returnNumber() {
//		return number;
//	}
//}