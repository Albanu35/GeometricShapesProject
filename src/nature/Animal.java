package nature;

public abstract class Animal {

	boolean carnivore;
	int weight;
	int size;
	String species;
	
	public Animal(boolean carnivore, int weight, int size, String species) {
		this.carnivore = carnivore;
		this.weight = weight;
		this.size = size;
		this.species = species;
	}
	
	 public abstract void eat(int unitsOfFood);
	 
	  public abstract void move(int distance);
}
