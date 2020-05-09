package geometric;

//I change class generic Shape in class type abstract  
//method of getSize() make a type abstract method

public abstract class Shape {
	String text;
	String material;

	// 2 constructors
	public Shape() {

	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}

	
	// method of calculate a area of form
	public abstract double getSize();

}
