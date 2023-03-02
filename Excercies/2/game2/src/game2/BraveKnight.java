package game2;

public class BraveKnight extends characters.Knight{
	public BraveKnight() {
		super();
	}
	public BraveKnight(int energy) {
		super(energy);
	}
	public BraveKnight(int energy, characters.Sword sword) {
		super(energy, sword);
	}

	void attack(Ogre ogre) {
		ogre.setEnergy(0);
	}
}
