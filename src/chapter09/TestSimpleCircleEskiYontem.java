package chapter09;

public class TestSimpleCircleEskiYontem {
	/** Main method */
	public static void main(String[] args) {
		
		double radius1 = 1;
		System.out.println("The area of the circle of radius " + radius1 + " is " + getArea(radius1));

		double radius2 = 25;
		System.out.println("The area of the circle of radius " + radius2 + " is " + getArea(radius2));
		
		double radius3 = 125;
		System.out.println("The area of the circle of radius " + radius3 + " is " + getArea(radius3));

		radius1 = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + radius1 + " is " + getArea(radius1));
	}
	
	static double getArea(double radius) {
		return radius * radius * Math.PI;
	}

}
