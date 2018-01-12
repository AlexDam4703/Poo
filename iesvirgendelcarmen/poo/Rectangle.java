package com.iesvirgendelcarmen.poo;

public class Rectangle {
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return height * width;
	}
	public int getPerimeter() {
		return (height+width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", Area=" + getArea() + ", Perimeter="
				+ getPerimeter() + "]";
	}
	
}
