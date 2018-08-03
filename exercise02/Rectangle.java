package exercise02;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() throws BadDimensionException {
		this.length = 2;
		this.width = 1;
		System.out.println("Length=2 and width=1 are the default.");
	}
	
	public Rectangle(double length, double width) throws BadDimensionException {
        this.setLength(length);
        this.setWidth(width);
    }
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) throws BadDimensionException {
		if (length <= 0) {
			throw new BadDimensionException("Length must be positive");
		}
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) throws BadDimensionException {
		if (width <= 0) {
			throw new BadDimensionException("Width must be positive");
		}
		this.width = width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public double getArea() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length= " + length + ", width= " + width + ", perimeter= "
				+ getPerimeter() + ", area= " + getArea() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Rectangle other = (Rectangle) obj;
			if (this.length == other.getLength() && this.width == other.getWidth()) {
				return true;
			} else if (this.length == other.getWidth() && this.width == other.getLength()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
