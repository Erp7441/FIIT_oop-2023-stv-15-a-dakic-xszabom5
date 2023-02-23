package game1;
public class Ogre {
	public boolean hungry;
	public int energy;
	
	public void revenge(Knight knight) {
		if (energy > knight.energy)
			knight.energy = (int) (0.9 * knight.energy);
	}
}
