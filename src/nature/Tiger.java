package nature;

public class Tiger extends Terrestrial {
	
	public Tiger(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
		
	}
	@Override
	public void eat(int unitsOfFood) {
		System.out.println("Eating meals like a tiger, " + unitsOfFood + " kg.");
	}

	@Override
	public void move(int distance) {
		System.out.println("Fast moving forward like a tiger, " + distance + " meters in " + distance / 2 + " days.");
	}

	@Override
	public void saySomething() {
		System.out.println("tggggrrr... This tiger says something... ");
	}

	@Override
	public void specialCharacteristic() {
		System.out.println("I have a fast legs!");
	}

}
