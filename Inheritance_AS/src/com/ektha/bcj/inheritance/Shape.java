package com.ektha.bcj.inheritance;

public class Shape {

	private String color;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

}
