package com.ektha.bcj.inheritance;

public class ShapeService {

	public Triangle drawTriangle() {

		Triangle triangle = new Triangle();
		triangle.setBase(11);
		triangle.setHeight(10.5);
		triangle.setColor("Green");
		return triangle;
	}

	public Rectangle drawRectangle() {

		Rectangle rectangle = new Rectangle();
		rectangle.setLength(5);
		rectangle.setBreadth(10);
		rectangle.setColor("Red");
		return rectangle;
	}

}
