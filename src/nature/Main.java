package nature;

public class Main {

	public static void main(String[] args) {
	//	Terrestrial aTerrestrialAnimal = new Terrestrial(false, 5, 10, "monkeys", 4, 2);

		Rhino rhino = new Rhino(false, 300, 100, "Greater one-horned rhino");
		rhino.eat(5);
		rhino.move(20);
		
		Animal rhino1 = new Rhino(true, 0, 0, "Greater one-horned rhino");
		rhino1.eat(5); // method is abstract in 'Animal' class
		rhino1.move(20); // method is abstract in 'Animal' class
	}

}
