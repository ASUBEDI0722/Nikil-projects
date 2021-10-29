package com.ektha.bcj;

//method overloading
public class Area {

	public static void main(String[] args) {

		System.out.println(findArea(3, 2));
		System.out.println(findArea(2, 2, 2));

	}

	public static int findArea(int l, int b) {

		int area = l * b;
		return area;

	}

	public static int findArea(int l, int b, int h) {

		int area = l * b * h;
		return area;
	}

}
