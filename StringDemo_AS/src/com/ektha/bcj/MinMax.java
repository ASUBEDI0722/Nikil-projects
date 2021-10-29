package com.ektha.bcj;

public class MinMax {

	public static void main(String[] args) {

		highestArray();
		lowestArray();

	}

	public static void highestArray() {
		int[] numbers = { 40, 20, 80, 65, 70, 90, 35, 10 };
		int temp = 0;
		for (int i : numbers) {
			if (i > temp) {
				temp = i;
			}
		}

		System.out.println("Highest array " + temp);

	}

	public static void lowestArray() {
		int[] numbers = { 40, 20, 80, 65, 70, 90, 35, 10 };
		int temp = 100;
		for (int i : numbers) {
			if (i < temp) {
				temp = i;
			}
		}

		System.out.println("Lowest array " + temp);

	}

}
