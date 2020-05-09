package geometric;

// a concret class type Triangle extends a Shape abstract class
// method of getSize is override from abstract method from class abstract of Shape
public class Triangle extends Shape {
	int base;
	int height;

	// 2 constructors
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public Triangle(String text, String material, int base, int height) {
		super(text, material);
		this.base = base;
		this.height = height;
	}

	// method of display a message with value of height
	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + this.height);
	}

	// Override method of toString
	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", base is: " + this.base + " made of " + super.material
				+ ", contains the text: " + super.text;
	}

	// method of generate Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
	}

	// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}

	// method of calculate a area of form
	@Override
	public double getSize() {
		return this.base * this.height / 2;
	}
}
