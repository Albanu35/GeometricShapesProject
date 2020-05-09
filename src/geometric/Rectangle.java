package geometric;

//a concret class type Rectangle extends a Shape abstract class
//method of getSize is override from abstract method from class abstract of Shape
public class Rectangle extends Shape {
	int width;
	int height;

	// 2 constructors
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(String text, String material, int width, int height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}

	// method of display a message with value of height a rectangle
	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " + this.height);
	}

	// Override method of display rectangle
	@Override
	public String toString() {
		return "Rectangle: height is " + this.height + " , width is:" + this.width + ", made of " + super.material
				+ ", contains the text: " + super.text;
		// Rectangle: height is 50, width is: 10, made of steel, contains the text:
		// "Yellow rectangle".
	}

	// override method of Hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	// method of calculate a area of form
	@Override
	public double getSize() {
		return this.width * this.height;
	}
}
