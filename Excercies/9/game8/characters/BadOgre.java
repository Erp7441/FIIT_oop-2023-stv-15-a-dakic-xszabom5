package characters;

public class BadOgre extends Ogre {
	public BadOgre() {
		super();
	}
	public BadOgre(int energy) {
		super(energy);
	}
	public BadOgre(int energy, boolean hungry) {
		super(energy, hungry);
	}

	public void revenge(Knight knight) {
		super.revenge(knight); // this was missing in previous versions 
		
		if (getHungry())
			eat(knight);
	}
	public void eat(Knight knight) {
		knight.setEnergy(0);
	}
}
