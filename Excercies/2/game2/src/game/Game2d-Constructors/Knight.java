
public class Knight {
	int energy;
	int additonalEnergy;
	
	public Knight() {
	}
		
	public Knight(int energy) {
		this.energy = energy;
	}

	void attack(Ogre ogre) {
		ogre.energy = (int) (0.9 * ogre.energy);
		additonalEnergy = (int) (0.1 * ogre.energy);
		ogre.revenge(this);
	}

}
