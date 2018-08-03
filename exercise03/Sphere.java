package exercise03;

public class Sphere extends Circle {
	
	public Sphere() {
		super();
	}
	
	public Sphere(double radius) throws IllegalArgumentException {
		super(radius);
	}
	
	public double getSurfaceArea() {
		return 4 * super.getArea();
	}
	
	public double getVolume() {
		return (4.0 / 3) * super.getArea() * super.getRadius(); 
	}
	
	@Override
	public String toString() {
		return "Sphere [radius= " + super.getRadius() + ", surface area= " + getSurfaceArea() + 
				", volume= " + getVolume() + "]";
	}
}
