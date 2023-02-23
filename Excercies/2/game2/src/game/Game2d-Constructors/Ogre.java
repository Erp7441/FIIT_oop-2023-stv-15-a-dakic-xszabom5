
public class Ogre {
	boolean hungry;
	int energy;
	
	void setValues(int energy) {
		this.energy = energy;
	}
	void setValues(boolean hungry) {
		this.hungry = hungry;
	}
	void setValues(int energy, boolean hungry) {
		this.energy = energy;
		this.hungry = hungry;
	}
	
	void revenge(Knight knight) {
		if (energy > knight.energy)
			knight.energy = (int) (0.9 * knight.energy);
	}
}
