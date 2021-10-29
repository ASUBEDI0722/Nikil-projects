package com.ektha.bcj;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		String name;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your full name in Format: Firstname space lastname.");
		name = scanner.nextLine();

		String[] splitName = name.split(" ");

		for (String a : splitName) {
			System.out.println(a);

		}

	}

}
