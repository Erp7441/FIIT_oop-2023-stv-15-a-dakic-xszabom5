package game1;
public class Knight {
	public int energy;
	
	public void attack(Ogre ogre) {
		ogre.energy = (int) (Math.random() * ogre.energy); // (int) just casts a float result into an int
		ogre.revenge(this); // this represents a reference to the current knight object
		System.out.println(this);
		// Is this output is diffrent for each pair because each pair is unique group of objects. They have identity.
	}
}
