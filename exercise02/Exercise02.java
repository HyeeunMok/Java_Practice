package exercise02;

public class Exercise02 {

	public static void main(String[] args) {

		try {
//			Rectangle rect = new Rectangle();
//			System.out.println(rect);
//			Rectangle rect1 = new Rectangle(-2.0, -3.4);
//			System.out.println(rect1);
			
//			Rectangle rect2 = new Rectangle(3, -3.4);
//			System.out.println(rect2);
			
//			Rectangle rect3 = new Rectangle(2, 2);
//			System.out.println(rect3);
			
			Rectangle rect4 = new Rectangle(4.0, 2.0);
			System.out.println(rect4);
			Rectangle rect5 = new Rectangle(4.0, 2.0);
			System.out.println(rect5);
			System.out.println(rect4.equals(rect5));
			Rectangle rect6 = new Rectangle(2.0, 4.0);
			System.out.println(rect6);
			System.out.println(rect4.equals(rect6));
			Rectangle rect7 = new Rectangle(3.0, 2.0);
			System.out.println(rect7);
			System.out.println(rect4.equals(rect7));
			
		} catch (BadDimensionException e) {
			System.out.println(e);
			
		} catch (Exception e) {
			System.out.println("Error occurs");
		}
	}
}
