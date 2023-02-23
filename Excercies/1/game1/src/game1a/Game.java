package game1a;

public class Game {
	public static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	public static void main(String[] args) {
		Knight k = new Knight();
		Ogre o = new Ogre();
		k.energy = 100;
		o.energy = 120;
		
		clash(o, k);

		System.out.println("knight " +
				k.energy + " / " + "ogre " +
				o.energy);
	}
}
