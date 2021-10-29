package com.ektha.bcj;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {

		String name;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name.");
		name = scanner.nextLine();

		printReverseString(name);

		scanner.close();

	}

	public static void printReverseString(String name) {

		String reversedString = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversedString = reversedString + name.charAt(i);
		}
		System.out.println("Reversed String : " + reversedString);

	}

}
