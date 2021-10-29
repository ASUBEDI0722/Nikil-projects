package com.ektha.bcj.inheritance;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, double length, double breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

}
