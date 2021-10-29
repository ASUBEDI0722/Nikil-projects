package com.ektha.bcj.inheritance;

import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {

		String shape;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What shape would you like to print? Rectangle/Triangle");

		shape = scanner.next();
		
		printShape(shape);
		scanner.close();
	}

	public static void printShape(String shapeName) {

		ShapeService shapeService = new ShapeService();


		if (shapeName.equalsIgnoreCase("Triangle")) {
			Triangle triangle = shapeService.drawTriangle();
			System.out.println(triangle);

		} else if (shapeName.equalsIgnoreCase("Rectangle")) {

			Rectangle rectangle = shapeService.drawRectangle();
			System.out.println(rectangle);

		} else {
			System.out.println("Invalid shape choice.");
		}
	}

}
