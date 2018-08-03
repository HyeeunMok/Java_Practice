package exercise03;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		this.height = 1;
	}
	
	public Cylinder(double radius, double height) throws IllegalArgumentException {
		super(radius);
		this.setHeight(height);
	}
	
	public void setHeight(double height) throws IllegalArgumentException {
		if (height <= 0) {
			throw new IllegalArgumentException("Height must be positive");
		}
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getSurfaceArea() {
		return 2 * super.getArea() + super.getCircumference() * this.height;
	}
	
	public double getVolume() {
		return super.getArea() * this.height;
	}
	
	@Override
	public String toString() {
		return "Cylinder [radius= " + super.getRadius() + ", height= " + height + ", surface area= " + getSurfaceArea() + 
				", volume= " + getVolume() + "]";
	}
}
