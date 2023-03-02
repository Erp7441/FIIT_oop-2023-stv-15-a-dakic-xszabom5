package game2;

public class BadOgre extends Ogre {
//	boolean hungry; // beware of attribute hiding!
	
	void revenge(characters.Knight knight) {
		if (hungry)
			eat(knight);
	}
	void eat(characters.Knight knight) {
		knight.setEnergy(0);
	}
}
