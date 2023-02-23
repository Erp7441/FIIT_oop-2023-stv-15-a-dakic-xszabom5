
public class BraveKnight extends Knight {

	public BraveKnight() {
		super();
	}
	public BraveKnight(int energy) {
		super(energy);
	}

	void attack(Ogre ogre) {
		ogre.energy = 0;
	}
}
