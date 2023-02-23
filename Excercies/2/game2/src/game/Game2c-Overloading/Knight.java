
public class Knight {
	int energy;

	void attack(Ogre ogre) {
		ogre.energy = (int) (0.9 * ogre.energy);
		ogre.revenge(this);
	}
}
