
public class BadOgre extends Ogre {
//	boolean hungry;
	
	void revenge(Knight knight) {
		if (hungry)
			eat(knight);
	}
	void eat(Knight knight) {
		knight.setEnergy(0);
	}
}
