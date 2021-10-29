package com.ektha.bcj.practice;

import java.util.Arrays;

public class CheckArray {

	public static void main(String[] args) {

		checkArray();

	}

	public static void checkArray() {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 1, 2, 3, 4, 5 };
		int array3[] = { 1, 2, 3, 3, 5 };

		int array4[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array2, array3));
		System.out.println(Arrays.equals(array2, array3));
	}
}
