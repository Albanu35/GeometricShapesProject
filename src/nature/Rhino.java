package nature;

public class Rhino extends Terrestrial {

	public Rhino(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
		
	}

	@Override
	public void eat(int unitsOfFood) {
		System.out.println("Eating grass like a rhino, " + unitsOfFood + " tons.");
	}

	@Override
	public void move(int distance) {
		System.out.println("Slowly moving forward like a rhino, " + distance + " meters in " + distance / 2 + " days.");
	}

	@Override
	public void saySomething() {
		System.out.println("Vveerrsseee... This rhino says something... ");
	}

	@Override
	public void specialCharacteristic() {
		System.out.println("I have a strong horn!");
	}
}
