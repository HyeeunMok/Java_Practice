package exercise03;

public class Exercise03 {

	public static void main(String[] args) {
		
		Circle cir = new Circle();
		System.out.println(cir);
		
		try {
			Circle cir1 = new Circle(2.0);
			System.out.println(cir1);
			Circle cir2 = new Circle(4.0);
			System.out.println(cir2);
			
			Cylinder cyl1 = new Cylinder(3.3, 4.2);
			System.out.println(cyl1);
			Cylinder cyl2 = new Cylinder(2.0, 5.0);
			System.out.println(cyl2);
			
			Cone con1 = new Cone(2.0, 3.0);
			System.out.println(con1);
			Cone con2 = new Cone(3.0, 5.0);
			System.out.println(con2);
			
			Sphere sph1 = new Sphere(7.0);
			System.out.println(sph1);
			Sphere sph2 = new Sphere(11.2);
			System.out.println(sph2);
//			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			
		} catch (Exception e) {
			System.out.println("Error occurs");
		}

	}

}
