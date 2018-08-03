package exercise03;

public class Cone extends Cylinder {
	public Cone() {
		super();
	}
	
	public Cone(double radius, double height) throws IllegalArgumentException {
		super(radius, height);
	}
	
	public double getSideLength() {
		return Math.sqrt((super.getRadius() * super.getRadius()) + (super.getHeight() * super.getHeight()));
	}
	
	public double getSurfaceArea() {
		return super.getArea() + Math.PI * super.getRadius() * this.getSideLength();
	}
	
	@Override
	public double getVolume() {
		return super.getVolume() / 3;
	}
	
	@Override
	public String toString() {
		return "Cone [radius= " + super.getRadius() + ", height= " + super.getHeight() + ", side length= " + 
				getSideLength() + ", surface area= " + getSurfaceArea() + ", volume= " + getVolume() + "]";
	}

}
