
public class Knight {
	private int energy;
	private int additionalEnergy;
	
	public Knight() {
	}
	public Knight(int energy) {
		setEnergy(energy);
	}	

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void increaseEnergy(int energy) {
		this.energy += energy;
	}
	public void decreaseEnergy(int energy) {
		this.energy -= energy;
	}
	public int getEnergy() {
		return energy + additionalEnergy;
	}

	void attack(Ogre ogre) {
		ogre.energy = (int) (0.9 * ogre.energy);
		ogre.revenge(this);
	}

}
