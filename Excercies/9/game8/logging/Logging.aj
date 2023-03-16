package logging;
import characters.*;

public aspect Logging {
/*	
	before(): call(* Ogre.revenge(..)) {
		System.out.println("revenge");
	}
*/
	before(Ogre o): call(* Ogre.revenge(..)) && target(o) {
		System.out.println("before revenge: hungry = " + o.getHungry());
	}

	after(Ogre o): call(* Ogre.revenge(..)) && target(o) {
		System.out.println("after revenge: hungry = " + o.getHungry());
	}
}
