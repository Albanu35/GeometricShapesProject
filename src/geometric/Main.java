package geometric;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// create 4 object, 2 types of shapes each create whith abstract reference type
		// Shape using upcasting mecanism

		Shape triangle = new Triangle(20, 25);
		Shape triangleIsoscel = new Triangle("I'm a isosceles!", "gold", 15, 10);
		Shape rectangle = new Rectangle(25, 35);
		Shape parallelepiped = new Rectangle("I'm a paralel", "silver", 50, 30);

		// create a shape arrayList
		ArrayList<Shape> geometricalShapes = new ArrayList<Shape>();
		geometricalShapes.add(triangle);
		geometricalShapes.add(triangleIsoscel);
		geometricalShapes.add(rectangle);
		geometricalShapes.add(parallelepiped);

		// method of toString class Triangle
		System.out.println(triangle.toString());
		System.out.println(triangleIsoscel.toString());
		System.out.println();

		// method of toString class Rectangle
		System.out.println(rectangle.toString());
		System.out.println(parallelepiped.toString());
		System.out.println();

		// method getSize() for each object

		System.out.println(triangle.getSize());
		System.out.println(triangleIsoscel.getSize());
		System.out.println(rectangle.getSize());
		System.out.println(parallelepiped.getSize());
		System.out.println();

		// display object's height
		for (int i = 0; i < geometricalShapes.size(); i++) {
			if (geometricalShapes.get(i) instanceof Triangle) {
				Triangle triangleRef = (Triangle) geometricalShapes.get(i);
				triangleRef.displayTriangleHeight();
			} else if (geometricalShapes.get(i) instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle) geometricalShapes.get(i);
				rectangleRef.displayRectangleHeight();
			} else {
				System.out.println("Error: unknown kind of shape");
			}

		}
	}
}