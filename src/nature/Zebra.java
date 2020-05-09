package nature;

public class Zebra extends Terrestrial {

	public Zebra(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
		
	}
	@Override
	  public void eat(int unitsOfFood) {
	    System.out.println("Eating grass like a zebra, " + unitsOfFood + " tons.");
	  }
	 
	  @Override
	  public void move(int distance) {
	    System.out.println("Faster moving forward like a zebra, " + 
	                       distance + " meters in " + distance / 2 + " days.");
	  }
	 
	  @Override
	  public void saySomething() {
	    System.out.println("Yyaaaa... This zebra says something... ");
	  }
	 
	  @Override
	  public void specialCharacteristic() {
	    System.out.println("I have stripes with 2 colors");
}
}
