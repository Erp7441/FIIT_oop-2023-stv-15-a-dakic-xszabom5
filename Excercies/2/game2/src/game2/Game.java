package game2;

public class Game {
	static void clash(Ogre ogre, characters.Knight knight) {
		knight.attack(ogre);
	}

	// both ogre and knight are beings who have energy
	// an interface provides uniform access
	// then we can define a method that calculates the energy difference with any two beings
	static int findEnergyDifference(Energy being1, Energy being2) {
		return being1.getEnergy() - being2.getEnergy();
	}
	
	public static void main(String[] args) {
		Ogre[] o = new Ogre[100];
		characters.Knight[] k = new characters.Knight[100];
		
		for (int i = 0; i < 20; i++) {
			k[i] = new BraveKnight(140, new characters.Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50, true);

//			o[i].eat(k[i]); // the eat() method is not in the Ogre class interface!
//			((BadOgre) o[i]).eat(k[i]); // if we are sure that an ogre is a BadOgre, we can force the compiler to see it as such
/*			
			System.out.println(findEnergyDifference(o[i], k[i]) + " " +
					findEnergyDifference(k[i], o[i]) + " " +
					findEnergyDifference(k[i], k[i]));
*/
		}

		for (int i = 20; i < 40; i++) {
			k[i] = new characters.Knight(40, new characters.Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50);
		}

		for (int i = 40; i < 100; i++) {
			k[i] = new characters.Knight(40, new characters.Sword(i));
			o[i] = new Ogre();
			o[i].setValues(50);
		}
		
		for (int i = 0; i < 100; i++) {
			clash(o[i], k[i]);
			System.out.println(i + ":" + "knight " + k[i].getEnergy() +
					" / " + "ogre " + o[i].getEnergy() + " sword: " + k[i].showSword());
		}
	}
}
