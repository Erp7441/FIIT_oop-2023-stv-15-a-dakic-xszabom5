
public class Knight extends Energy {
	
	public Knight() {
	}
	public Knight(int energy) {
		setEnergy(energy);
	}	

	void attack(Ogre ogre) {
		ogre.energy = (int) (0.9 * ogre.energy);
		ogre.revenge(this);
	}

}
