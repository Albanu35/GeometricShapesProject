package nature;

public abstract class Terrestrial extends Animal {
	
	public Terrestrial(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
	}

	public abstract void saySomething();
	 
	  public abstract void specialCharacteristic();
}
