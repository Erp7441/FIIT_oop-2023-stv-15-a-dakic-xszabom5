package game1c;

public class BadOgre extends Ogre {	   

	public void revenge(Knight knight) {
		if (hungry)
			eat(knight);
	}

	public void eat(Knight knight) {
		knight.energy = 0;
	}

}


