package edu.monmouth.shape;

public class Rectangle implements Shape{
	private int length;
	private int width;

	public Rectangle (int length, int width) {
		this.setLength(length);
		this.setWidth(width);
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		if(width >0) {
		this.width = width;
		}
		else {this.width =0;
		}
	}
	
	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		}
		else {this.width=0;
		}
		
	}
	@Override
	public String toString() {
		String shapeString = "The area of this Rectangle is: " +this.area();
		return shapeString;
		
	}
	
	public double area() {
		double area = length*width;
		return area;
	}
}
