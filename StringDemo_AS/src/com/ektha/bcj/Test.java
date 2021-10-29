package com.ektha.bcj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String name;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your full name.");
		name = scanner.nextLine();

		printReverseString(name);
		printFirstThreeCharacters(name);

		printLastThreeCharacters(name);

	}

	public static void printReverseString(String name) {

		String reversedString = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversedString = reversedString + name.charAt(i);
		}
		System.out.println("Reversed String : " + reversedString);

	}

	public static void printFirstThreeCharacters(String name) {

		if (name.length() > 4) {
			String firstThreeChars = name.substring(0, 3);
			System.out.println("First three character : " + firstThreeChars);

		}

	}

	public static void printLastThreeCharacters(String name) {

		if (name.length() > 4) {
			String lastThreeChars = name.substring(name.length() - 3);
			System.out.println("Last three character : " + lastThreeChars);

		}

	}

}
